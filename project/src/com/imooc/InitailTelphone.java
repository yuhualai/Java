package com.imooc;

public class InitailTelphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//通过无参的构造方法可以创建对象
	 Telphone tel=new Telphone();
	 System.out.println(tel.cpu);
        //通过有参的构造方法可以创建对象，并给对象中的实例变量赋值
	 Telphone tel1=new Telphone(5.3f,23f,132);
	 System.out.println(tel1.cpu);
//	 tel.senMessage();
	 //给实例变量赋值
	 tel.cpu=5.1f;
	 tel.mem=3.4f;
	 tel.screen=9.0f;

	 //调用对象的方法
//	 tel.senMessage();

	}

}
