package com.test;

public class uo {
	public static void main(String args[]) {
		// Animal 对象
		Animal b = new Dog(); // Dog 对象

		// a.move();// 执行 Animal 类的方法

		b.move();// 执行 Dog 类的方法
//		b.bark();
	}
}

class Animal {
	public void move() {
		
		System.out.println("动物-可以移动");
	}

	
}

class Dog extends Animal {
	public void move() {
		super.move();
		System.out.println("狗可以跑和走");
	}

//	public void bark() {
//		System.out.println("狗可以吠叫");
//	}
}