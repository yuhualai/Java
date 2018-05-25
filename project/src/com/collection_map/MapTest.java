package com.collection_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	/**
	 * 用来承装学生类型对象
	 */
	public Map<String, Student> students;

	public MapTest() {
		this.students = new HashMap<String, Student>();

	}

	public void TestPut() {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		int i = 0;
		while (i < 13) {
			System.out.println("请输入学生ID：");
			String stuID = console.nextLine();
			//判断该ID是否被占用
			Student stu = students.get(stuID);
			if (stu == null) {
				//提示输入学生姓名
				System.out.println("请输入学生姓名：");
				String stuName = console.nextLine();
				//创建新的学生对象
				Student newStudent = new Student(stuID, stuName);
				//通过调用students的put方法，添加ID-学生映射
				students.put(stuID, newStudent);
				
				System.out.println("成功添加学生：" + students.get(stuID).name);
				i++;
			} else {
				System.out.println("该学生ID已被占用！");
				continue;
			}
		}
	}

	public void testKeySet() {
		// 通过keySet方法，返回Map中所有“键”的Set集合
		Set<String> keySet = students.keySet();
		// 取得student的容量
		System.out.println("总共有" + students.size() + "个学生；");
		// 遍历keySet，取得每一个键，再调用get方法取得每个键对应的value
		for (String stuID : keySet) {
			Student stu = students.get(stuID);
			if (stu != null) {
				System.out.println("学生：" + stu.name);
			}
		}
	}
	/**
	 * 测试删除Map中的映射
	 * */
	public void testRemove(){
		
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
//		int i=0;
		while(true){
			System.out.println("请输入要删除的学生ID");
			String stuID = console.nextLine();
			Student stu = students.get(stuID);
			if(stu==null){
				System.out.println("该ID不存在！");
				continue;
			}
		students.remove(stuID);
		System.out.println("成功删除学生："+stu.name);
		break;
		}
		
	}
	/**
	 * 通过entrySet方法来遍历Map
	 * */
	public void testEntrySet(){
		//通过entrySet方法，返回Map中所有键值对
		Set<Entry<String,Student>> entrySet = students.entrySet();
		for(Entry<String,Student> entry:entrySet){
			System.out.println("取得值："+entry.getKey());
			System.out.println("对应的值为："+entry.getValue().name);			
		}
		
	}
	
	/**
	 * 利用put方法修改Map中的已有映射
	 * */
	public void testModify(){
		//提示输入要修改的ID
		System.out.println("请输入要修改的ID：");
		//创建一个Scanner对象，去获取从键盘输入的学生ID字符串
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		while(true){
			//取得从键盘输入学生ID
			String stuID = console.nextLine();
			//从students中查找该学生ID对应的学生对象
			Student stu = students.get(stuID);
			if(stu==null){
				System.out.println("该ID不存在！请重新输入");
				continue;
			}
			//提示当前对应的学生对象姓名
			System.out.println("当前该学生的ID，所对应的学生为："+stu.name);
			//提示输入新的学生姓名，来修改已有的映射
			String stuName = console.nextLine();
			Student newStudent = new Student(stuID, stuName);
			//通过调用students的put方法，添加ID-学生映射
			students.put(stuID, newStudent);
			System.out.println("修改成功");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt = new MapTest();
		mt.TestPut();
		mt.testKeySet();
//		mt.testRemove();
//		mt.testEntrySet();
		mt.testModify();
		mt.testEntrySet();
	}

}
