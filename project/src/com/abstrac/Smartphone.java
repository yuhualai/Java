package com.abstrac;

//implements实现接口语法
public class Smartphone extends Telphone implements IPlayop{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("语音打电话");

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("语音发信息");
	}

	@Override//	1、使用接口  一个类可以实现一个或多个接口，实现接口使用implements关键字。Java中
//  一个类只能继承一个父类，是不够灵活的，通过实现多个接口可以补充
	public void playGame() {
		// TODO Auto-generated method stub   类体部分//如果继承了抽象类，需要实现继承的抽象方法；要实现接口中的抽象方法
		System.out.println("可以打游戏");
	}

	@Override
	public void playop() {
		// TODO Auto-generated method stub
		System.out.println("链接电视");
	}

	@Override
	public void playcap() {
		// TODO Auto-generated method stub
		
	}

	

}
