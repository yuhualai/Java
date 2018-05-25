package com.test;

import java.util.Arrays;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method op = new Method();
		System.out.println(op.calcSum());

		int[] s = { 12, 233, 33 };
		op.show(s);
		
		
		System.out.println(op.show("小于"));

	}

	public double calcSum() {
		int a = 4;
		double b = 22.23;
		double sum = a + b;
		return sum;
	}

	// Java 中带参无返回值方法的使用
	public void show(int[] scors) {

		Arrays.sort(scors);
		System.out.println();
		for (int i = 0; i < scors.length; i++) {
			System.out.println(scors[i]);
		}
		System.out.println(Arrays.toString(scors));
	}

	// Java 中带参带返回值方法的使用
	public String show(String name) {
		return "欢迎您，" + name + "!";
	}
}
