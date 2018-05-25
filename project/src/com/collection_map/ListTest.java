package com.collection_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ListTest {
	/**
	 * 
	 * 用于存放备选课程的List
	 * */
	public List coursesToSelect;
//	private Object 数学;
	
	public ListTest(){
		this.coursesToSelect = new ArrayList();
	}
	/**
	 * 
	 * 用于往coursesToSelect中添加备选课程
	 * */
	public void testAdd(){
		Course cr1 = new Course("1","数据结构");
		
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程："+temp.id+":"+temp.name);
		
		Course cr2 = new Course("2","c语言");
		coursesToSelect.add(cr2);
		Course temp2 = (Course) coursesToSelect.get(1);
		System.out.println("添加了课程："+temp2.id+":"+temp2.name);
		
		
		//以下方法会抛出数组下标越界异常
//		coursesToSelect.add(3,cr3);  小于2不会
		
		
		
		Course[] course = {new Course("3","离散数学"),new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		System.out.println("添加了课程："+temp3.id+":"+temp3.name);
		System.out.println("添加了课程："+temp4.id+":"+temp4.name);
		
		
		Course[] course2 = {new Course("5","高等数学"),new Course("6","大学英语")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		System.out.println("添加了课程："+temp5.id+":"+temp5.name);
		System.out.println("添加了课程："+temp6.id+":"+temp6.name);

	}
	
	/**
	 * 取得List中元素方法
	 * **/
	public void TestGet(){
		int size = coursesToSelect.size();
		for(int i=0;i<size;i++){
		Course cr=(Course) coursesToSelect.get(i);
		System.out.println("添加了课程："+cr.id+":"+cr.name);

		}
	}
	
	/**
	 * 通过迭代器来遍历List
	 * **/
	public void TestIterator(){
		//通过集合的Iterator方法，取得迭代器的实例
		Iterator it = coursesToSelect.iterator();
		System.out.println("有如下课程待选(通过迭代器访问)：");
		while(it.hasNext()){
			Course cr = (Course) it.next();
			System.out.println("课程："+cr.id+":"+cr.name);
		}
		
	}
	/**
	 * 通过for each方法访问集合元素
	 * */
	public void TestForEach(){
		System.out.println("有如下课程待选(通过For Each访问)：");
		for(Object obj:coursesToSelect){
			Course cr = (Course) obj;
			System.out.println("课程："+cr.id+":"+cr.name);
		}
	}

	/**
	 * 修改List中元素
	 * */
	public void TestModify(){
		coursesToSelect.set(2, new Course("7","矛盾"));
	}
	/**
	 * 删除List中元素
	 * */
	public void TestRemove(){
//		Course cr = (Course) coursesToSelect.get(2);
//		System.out.println("课程："+cr.id+":"+cr.name+",即将被删除");
		coursesToSelect.remove(2);
		System.out.println("成功删除课程");
		TestForEach();

		

	}

	
	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.TestGet();
		lt.TestIterator();
		lt.TestForEach();
		lt.TestModify();
		lt.TestForEach();
		lt.TestRemove();



    }
}
