package com.test;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array minc = new Array();
		minc.test();
//		minc.array();
	}

	public void test() {
		int[] score = new int[5];
		int[] scores = { 27, 23 ,23,43, 323, 2, 90, 67, 2, 0 };
		int[] scor = new int[] { 27, 23, 43, 323, 232 };

		Arrays.sort(scores);// 排序

		System.out.println("排序后数组中的元素的值：");
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		// Arrays.toString(数组名);将数组转换为字符串
		System.out.println(Arrays.toString(scores));
		System.out.println("-----");
		System.out.println(scores);

		// 使用foreach操作数组 简单
		for (int sc : scores) {
			System.out.println(sc);
		}
	}

	public void array() {
		// 定义两行三列的二维数组并赋值
		String[][] names = { { "tom", "jack", "mike" }, { "zhangsan", "lisi", "wangwu" } };

		// 通过二重循环输出二维数组中元素的值
		names[0][2]="Taoli";
		for (int i = 0; i < names.length; i++) {

			for (int j = 0; j < names[i].length; j++) {

				System.out.println(names[i][j]);
			}

			System.out.println();
		}
	}



}
