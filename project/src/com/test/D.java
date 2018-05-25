package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class D {

	public static void main(String[] args) throws ParseException {
		// 创建Date对象，表示当前时间
		Date d = new Date();
		String day = "2017年04月08日 10:50:20";
		// 创建SimpleDateFormat对象，指定目标格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM");
		SimpleDateFormat sd = new SimpleDateFormat("yyyy年MM月dd日 HH:MM:SS");

		// 调用format()方法，格式化时间。转换为指定格式字符串
		String today = sdf.format(d);

		Date date = sd.parse(day);

		// 输出转换后的字符串
		System.out.println(today);
		System.out.println("当前时间：" + date);

	}

}
