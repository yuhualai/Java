package com.abstrac;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone phone1 = new Cellphone();
		phone1.call();
		phone1.message();
		Telphone phone2 = new Smartphone();
		phone2.call();
		phone2.message();
		
		
		IPlayGame ip1 = new Smartphone();
		ip1.playGame();
		IPlayop op1 = new Smartphone();
		op1.playop();
		IPlayGame ip2 = new Psp();
		ip2.playGame();
		IPlayop op2 = new Psp();
		op2.playop();

		
		
		IPlayGame ip3 = new IPlayGame(){

			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类的方式接口");
			}		
		};
		ip3.playGame();
		
		//或者
		new IPlayGame(){
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类的方式接口2");
			}		
		}.playGame();
	}

}
