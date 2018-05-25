package com.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//            //准备文件lol.txt其中的内容是AB，对应的ASCII分别是65 66
//            File f =new File("/Users/yuhualai/Desktop/pic/lol.txt");
//            //创建基于文件的输入流
//            FileInputStream fis =new FileInputStream(f);
//            //创建字节数组，其长度就是文件的长度
//            byte[] all =new byte[(int) f.length()];
//            //以字节流的形式读取文件所有内容
//            fis.read(all);
//            for (byte b : all) {
//                //打印出来是65 66
//                System.out.println(b);
//            }
//             
//            //每次使用完流，都应该进行关闭
//            fis.close();
//              
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

		
		try {
            // 准备文件lol2.txt其中的内容是空的
            File f = new File("/Users/yuhualai/Desktop/pic/lol2.txt");
            // 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
            byte data[] = { 88, 89 };
 
            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f);
            // 把数据写入到输出流
            fos.write(data);
            // 关闭输出流
            fos.close();
             
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		
		
		
//		File f = new File("d:/lol.txt");
//		  
//        //把流定义在try()里,try,catch或者finally结束的时候，会自动关闭
//        try (FileInputStream fis = new FileInputStream(f)) {
//            byte[] all = new byte[(int) f.length()];
//            fis.read(all);
//            for (byte b : all) {
//                System.out.println(b);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//  
	}

}
