package com.collection_map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSelect {
	
	public List<Course> courses;
//	public Scanner console;
	public TestSelect(){
		this.courses = new ArrayList<Course>();
//		console=new Scanner(System.in);
	}
	public void testAdd(){
		System.out.println("添加了课程：");

		Course cr1= new Course("1","大学英语");
		courses.add(cr1);

		Course cr2= new Course("2","JAVA");
		courses.add(cr2);
		Course cr3= new Course("3","C#");
		courses.add(cr3);
		Course cr4= new Course("4","线性代数");
		courses.add(cr4);
		Course cr5= new Course("5","高等数学");
		courses.add(cr5);

	}
	/**
	 * 测试循环遍历
	 * */
	public void testForEach(){
		for(Course cr:courses){
			System.out.println(cr.id+":"+cr.name);
		}
	}
	/**
	 * 测试List的contains方法
	 * */
//	public void testListContains(){
//		//取得备选课程序列的第0个元素
//		Course course = courses.get(3);
//		//打印输出courses是否包含course对象
//		System.out.println("取得课程："+course.name);
//		System.out.println("备选课程中是否包含课程："+course.name+","+courses.contains(course));
//		//contains某个系列是否包含某个对象
//		//提示输入课程名称
//		System.out.println("请输入课程名称：");
//		String name = console.next();
//		//创建一个新的课程对象，ID和名称，与course对象完全一样
//		Course course2 = new Course();
//		course2.name = name;
//		System.out.println("新创建课程："+course2.name);
//		System.out.println("备选课程中是否包含课程："+course2.name+","+courses.contains(course2));
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSelect se= new TestSelect();
		se.testAdd();
//		se.testListContains();
		se.testForEach();
		//创建一个学生对象
		Student student= new Student("1","小明");
		System.out.println("欢迎学生:"+student.name+"选课！"+"(只能选三门课程)");
		
		Scanner console = new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.println("请输入课程ID");
			String courseld = console.next();//键盘上返回输入的字符串
			for (Course cr: se.courses) {
				if(cr.id.equals(courseld)){
					student.courses.add(cr);
					/**
					 * set中添加某个对象，无论添加多少次，最终只会保留一个该对象的引用并且保留的第一次添加的那一个
					 * **/
					student.courses.add(cr);
				}				
				
			}
						
		}
		se.testFor(student);
	}
	public void testFor(Student student){
		for (Course cr : student.courses) {
			System.out.println("选择了课程："+cr.id+":"+cr.name);
		}
	}

}
