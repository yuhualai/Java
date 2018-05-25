package Jsoup;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GetTest {
	
	public void testJsop() {
		try {
			Connection conn = Jsoup.connect("https://www.baidu.com/s?wd=%E6%8E%A5%E5%8F%A3%E8%87%AA%E5%8A%A8%E5%8C%96%E6%B5%8B%E8%AF%95%E6%A1%86%E6%9E%B6&rsv_spt=1&rsv_iqid=0x838bb85000011742&issp=1&f=3&rsv_bp=0&rsv_idx=2&ie=utf-8&tn=baiduhome_pg&rsv_enter=1&rsv_sug3=14&rsv_sug1=13&rsv_sug7=101&rsv_sug2=1&prefixsug=%25E6%258E%25A5%25E5%258F%25A3%25E8%2587%25AA%25E5%258A%25A8%25E5%258C%2596&rsp=1&inputT=5849&rsv_sug4=7399").ignoreContentType(true);
//			conn.data("data","[]");
//			conn.data("errno","0");
//			conn.data("request_id","1802784152");
//			conn.data("timestamp","1521786602");
			Document doc = conn.get();
			System.out.println(doc);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetTest gTest = new GetTest();
		gTest.testJsop();

	}

}
