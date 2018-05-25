package com.test;

public class TryCathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCathTest cath = new TryCathTest();
//		 int res=cath.test();
//		 System.out.println("test()方法，执行完毕！返回值为："+res);
//		 
		 int res2 = cath.test2();
		 System.out.println("我想大声告诉你"+res2);

	}
	public int test(){
		int divider = 10;
		int result = 100;
		try {
			while(divider > -1){
				divider--;
				result = result +100/divider;
			}
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("循环抛出异常了！");
			return -1;
		}

	}
	public int test2(){
		int divider = 10;
		int result = 100;
		try {
			while(divider > -1){
				divider--;
				result = result +100/divider;
			}
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("循环抛出异常了！");
			return result =9999;
		}finally{
			System.out.println("这是finally");
			System.out.println("我是result，我的值是："+result);
		}

	}

}
