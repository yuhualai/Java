package liangyihui.net;

import org.testng.annotations.Test;

import liangyihui.list.Encap;
import liangyihui.list.ForEn;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Search extends Encap{

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void search() throws InterruptedException {
		
		ForEn lis = new ForEn(driver);
		lis.Having();
		
		driver.findElementByName("top search").click();
		Thread.sleep(1000);
		driver.findElementByClassName("XCUIElementTypeOther").sendKeys("肺癌");
		Thread.sleep(1000);
		driver.findElementByName("Search").click();
		Thread.sleep(1000);
		WebElement fi = driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"
						+ "/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
		String ai = fi.getAttribute("name");
		String str = "肺癌";
		System.out.println(ai);
		if (ai.indexOf(str) != -1) {
			System.out.println("搜索" + str + "结果正确");
		} else {
			System.out.println("搜索失败");
		}
		Thread.sleep(1000);
		fi.click();
		WebElement ti = driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
						+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
						+ "XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]"));
		String bi = ti.getAttribute("name");
		System.out.println(bi);
		Thread.sleep(1000);
		Assert.assertEquals(ai, bi);
		Thread.sleep(1000);

	}


}