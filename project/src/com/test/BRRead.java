package com.test;

import java.io.*;

public class BRRead {
  public static void main(String args[]) throws IOException
  {
    char c;
    // 使用 System.in 创建 BufferedReader 
    BufferedReader br = new BufferedReader(new 
                       InputStreamReader(System.in));
//    System.out.println("输入字符, 按下 'q' 键退出。");
    // 读取字符
//    br.read();
//    br.readLine();
//    do {
//       c = (char) br.read();
//       System.out.println(c);
//    } while(c != 'q');
    
    
    String str;
    System.out.println("Enter lines of text.");
    System.out.println("Enter 'end' to quit.");
    do {
       str = br.readLine();
       System.out.println(str);
    } while(!str.equals("end"));
    
    
//    int b; 
//    b = 'A';
//    System.out.write(b);
//    System.out.write('\n');
  }
}
