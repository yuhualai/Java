package com.test;

import java.util.Arrays;

public class can {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		can op = new can();
		int[] score = {23,45,23,45,67};
		String oo = op.sort(score);
		System.out.println(oo);
		

	}
	public String sort(int[] scores){
		Arrays.sort(scores);
		System.out.println(scores.length);
		return Arrays.toString(scores);
		
	}

}
