package com.polymorphism;

public class Coulin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1 = new Animal();// 父类引用是可以指向本类对象的          引用多态
		Animal obj2 = new Dog(); // 父类的引用是可以指向子类对象的
		Animal obj3 = new Cat();// 父类的引用是可以指向子类对象的
//		
//		Dog dog = new Dog();
//		dog.kan();
//		obj1.eat();
//		obj2.eat();
//		obj2.Door();//不允许
		obj3.eat();
		
		
//		Dog dog = new Dog();
//		Animal animal =dog;//自动类型提升 向上类型转换
//		Dog dog2 = (Dog)animal;//向下类型转换 强制类型转换
//		
//		if(animal instanceof Cat){
//		Cat cat= (Cat)animal;//1、编译时 Cat类型  2、运行时 Dog类型
//		}else{
//			System.out.println("无法进行类型转换");
//		}
	}

}
