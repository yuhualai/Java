package com.inheritance.override;

//Dog继承父类（Animal）所有成员变量和方法
public class Dog extends Animal {
	public int age =5;//类型和父类一样重写
	public void eat(){//方法和父类方法一样重写
//		System.out.println("狗吃东西的能力");
//		System.out.println(age);
//		System.out.println(name);
//		System.out.println("重写一段代码");
		super.eat();
	}
	//初始化 第二执行
    public Dog(){
//    	int age =2;
    	super();
    	System.out.println("dog子类构造方法"+age);
    }
  
	public void method(){
    	System.out.println(super.age);//super方法得到父类属性和方法
    	super.eat();
    }
	
	
	//toString()方法的时候返回的对象的哈希code码()；Source-Genereate toString
	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	
	
	//equals()方法
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
}
