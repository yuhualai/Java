package liangyihui.net;

import org.testng.annotations.Test;

import liangyihui.list.ForEn;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Public_ClassThree extends Public_class{
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void publiclass() throws InterruptedException {
		super.publiclass();
		ForEn lis = new ForEn(driver);

		System.out.println("--3.点击热门系列-查看更多--");
		driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
				+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")).click();
        Thread.sleep(2000);
		
		System.out.println("--4.断言公开课系列专题标题和详情页标题是否一致--");	
		
	    WebElement pub = lis.getAllText().get(1);
	    String pubname = pub.getAttribute("name");
	    System.out.println(pubname);
		Assert.assertTrue(pub.isDisplayed());		
		pub.click();
		Thread.sleep(3000);
		lis.getAllOther().get(0).click();
		Thread.sleep(1000);
		
		WebElement pat = lis.getAllText().get(1);
		String patname = pat.getAttribute("name");
		System.out.println(patname);
		Assert.assertTrue(pat.isDisplayed());		
		Assert.assertEquals(pubname, patname);
		Thread.sleep(2000);

//		System.out.println("--5.关注提醒--");	
//		lis.getAllText().get(3).click();
//		Thread.sleep(2000);
//		lis.login();
//		Thread.sleep(1000);
//		lis.getAllText().get(3).click();
//		WebElement yi = lis.getAllText().get(3);
//		String yiname = yi.getAttribute("name");
//		Assert.assertTrue(yi.isDisplayed());	
//
//		System.out.println(yiname);
//		Thread.sleep(3000);


	}


}