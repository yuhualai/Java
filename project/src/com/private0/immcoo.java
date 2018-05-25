package com.private0;

public  class immcoo {
	private float cpu;//封装第一步加private修饰符
	private float men;
	
	//封装第二部
	
//返回一个值	
//	public float getCpu(){
//		return cpu;
//	}
//	//输入一个值
//	public void setCpu(float newCpu){
//		cpu=newCpu;
//	}
	
	public float getCpu() {
		return cpu;
	}
	public void setCpu(float cpu) {
		this.cpu = cpu;
	}
	public float getMen() {
		return men;
	}
	public void setMen(float men) {
		this.immcoo();
		this.men = men;
	}
	private void immcoo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
//	public immcoo(float newCpu,float newMen){
//		if(newCpu<20.5f){
//			System.out.println("你输入的参数有问题，自动赋值20.5");
//			cpu=20.5f;
//		}else{
//			cpu=newCpu;
//		}
//		
//		if(newMen<10.0f){
//			men=10.0f;
//		}else{
//			men=newMen;
//		}
//		System.out.println("有参的构造方法执行"+cpu+" "+men);
//	}
}
