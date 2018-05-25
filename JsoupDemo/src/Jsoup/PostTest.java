package Jsoup;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class PostTest {

	public void testJsop() {
		try {
			Connection conn = Jsoup.connect("http://bos.liangyihui.net/bos/event/eventlist").ignoreContentType(true);
			conn.header("Content-Type","application/json");
			conn.data("filter","'pageIdx','0','pageSize','50'");
			conn.data("eventKeywords","[]");
			conn.data("eventIDs","[]");
			conn.data("head","'auth','9jGyf/0o3Qi80geI2/AnblAktjvu2Ffoc7A8xceRg4w='");
			Document doc = conn.post();
			System.out.println(doc);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostTest gTest = new PostTest();
		gTest.testJsop();

	}
}
