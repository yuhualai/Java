package com.collection_map;

import java.util.ArrayList;
import java.util.List;

public class TestCourse {
	/**
	 * 
	 * 带有泛型-Course，的list类型属性
	 * courses用于存放备选课程的List
	 * */
	public List<Course> courses;
	public TestCourse(){
		this.courses = new ArrayList<Course>();
	}
	
	
//	List<Course> courses = new ArrayList<Course>();//只能在本类中使用
	
	public void testAdd(){
		Course cr1= new Course("1","大学英语");
		courses.add(cr1);		
//		System.out.println(courses.get(0));
		System.out.println("添加了课程："+cr1.id+":"+cr1.name);
		
		
//		泛型集合中，不能添加泛型规定的类型及其类型以外的对象，否则会报错！
//		courses.add("能否添加一些奇怪的东西！！");
		

		Course cr2= new Course("2","JAVA");
		courses.add(cr2);
		Course cr3= new Course("3","C#");
		courses.add(cr3);
		
		Course cr4= new Course("4","Python");
		courses.add(cr4);
		Course cr5= new Course("5","javaScript");
		courses.add(cr5);


	}
	/**
	 * 测试循环遍历
	 * */
	public void testForEach(){
		for(Course cr:courses){
			System.out.println(cr.id+": "+cr.name);
		}
	}
	/**
	 * 泛型结合可以添加泛型的子类型的对象实例
	 * **/
	public void testChild(){
		ChildcCourse ccr = new ChildcCourse();
		ccr.id = "6";
		ccr.name = "我是子类型的课程对象实例";
		courses.add(ccr);
		
	}
	/**
	 * 泛型不能使用基本类型
	 * 1、泛型集合中的限定类型不能使用基本数据类型 
	 * 2、可以通过使用包装类限定允许存入的基本类型 int - integer
	 * **/
	public void testBasicType() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		System.out.println("基本类型必须使用包装类作为泛型"+list.get(0));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCourse tg = new TestCourse();
		tg.testAdd();
//		tg.testForEach();
		tg.testChild();
		tg.testForEach();
//		tg.testBasicType();
		
	}

}
