package liangyihui.app;

import org.testng.annotations.Test;

import liangyihui.test.Encap;
import liangyihui.test.Public;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Subscribe_Management extends Public{

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	// 订阅管理
	public void f2() throws InterruptedException {
		Encap tal = new Encap(driver);
		tal.Having();
		Thread.sleep(3000);

		driver.findElementById("net.liangyihui.app:id/im_subscribe").click();
		Thread.sleep(1000);

		driver.findElementById("net.liangyihui.app:id/tv_subscribe").click();
		Thread.sleep(1000);
		List<WebElement> list1 = driver.findElementsById("net.liangyihui.app:id/tv_type");
		System.out.println("疾病类型：" + list1.size() + " 种");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i).getAttribute("name"));
		}
		Thread.sleep(1000);

		// int width = driver.manage().window().getSize().width;
		// int height = driver.manage().window().getSize().height;
		// driver.swipe(width/2, height*3/4, width/2, height/4, 200);
		// Thread.sleep(1000);
		//
		// List<WebElement> list2 =
		// driver.findElementsById("net.liangyihui.app:id/tv_type");
		// System.out.println("疾病类型："+list2.size()+" 种");
		// for(int i = 0; i < list2.size(); i++){
		// System.out.println(list2.get(i).getAttribute("name"));
		// }
		driver.findElementById("net.liangyihui.app:id/tv_type_status").click();
		tal.login();
		Thread.sleep(1000);

		List<WebElement> status = driver.findElementsById("net.liangyihui.app:id/tv_type_status");
		for (int i = 0; i < status.size(); i++) {
			status.get(i).click();
		}
		Thread.sleep(1000);

		HashSet<String> hset = new HashSet<String>();
		hset.add(null);
		hset.add(null);
		hset.add(null);
		System.out.println(hset);
		driver.findElementByClassName("android.widget.ImageButton").click();
		Thread.sleep(1000);
	}

}
