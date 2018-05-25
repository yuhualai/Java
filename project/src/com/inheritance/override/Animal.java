package com.inheritance.override;

public class Animal extends Object {   //final修饰类、方法、属性不可用  final public class Animal extends Object{}
	//Object是Animal父类
	 int age =10;
	 public String name;
	 public void eat(){                //final public void eat(){}不能被重写
		System.out.println("动物吃东西的能力");
		System.out.println(age);
		System.out.println(name);
	 }
	//初始化 第一执行
	 public Animal(){
		int age =20;
		System.out.println("Animal父类构造方法"+age);
	 }

}
