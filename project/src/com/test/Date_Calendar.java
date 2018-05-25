package com.test;

import java.util.Calendar;
import java.util.Date;

public class Date_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建Calendar对象
		Calendar c =  Calendar.getInstance();
		//获取年
		int year = c.get(Calendar.YEAR);
		//获取月份，0表示1月份
		int month = c.get(Calendar.MONTH)+1;
		int day =c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute= c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("当前时间："+year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
		
		
		
		Date date = c.getTime();
		Long time = c.getTimeInMillis();
		System.out.println("当前时间："+date);
		System.out.println("当前毫秒数："+time);

	}

}
