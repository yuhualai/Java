package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		    File file = new File("/Users/yuhualai/Desktop/Untitled.py");
//	        System.out.println(txt2String(file));
	        try{
	            BufferedReader br = new BufferedReader(new FileReader("/Users/yuhualai/Desktop/Untitled.py"));//构造一个BufferedReader类来读取文件
	            String s;
	            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
//	                result.append(System.lineSeparator()+s);
	                System.out.println(s);
	            }
//	            br.close();    
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        

	}
//	 public static String txt2String(File file){
////	        StringBuilder result = new StringBuilder();
//	        try{
//	            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
//	            String s;
//	            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
////	                result.append(System.lineSeparator()+s);
//	                System.out.println(s);
//	            }
//	            br.close();    
//	        }catch(Exception e){
//	            e.printStackTrace();
//	        }
////	        return result.toString();
//	    }
	    
}
