package com.imooc;
//1、定义一个类
public class Telphone {
	//2、属性(成员变量)
	float screen;
	float cpu;
	float mem;
	//3、方法
	void call(){
		System.out.println("Telphone打电话功能");
	}
	void senMessage(){
		System.out.println("screen"+screen+"cpu"+cpu+"mem"+mem+"Telphone有发短信功能");
	}
    //4、构造方法
	public Telphone(){
		System.out.println("无参构造方法执行了！");
	}
	public Telphone(float newScreen,float newCpu,float newMem){
		//参数赋值给成员变量
//		if(newScreen<3.5f){
//			System.out.println("您输入的参数有问题，自动赋值3.5");
//			screen = 3.5f;
//		}else{
//			screen = newScreen;
//		}
		screen = newScreen;
		cpu = newCpu;
		mem = newMem;
		System.out.println("有参构造方法执行了！");
	}
}
