 package liangyihui.net;

import org.testng.annotations.Test;

import liangyihui.list.Encap;
import liangyihui.list.ForEn;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Mine_collect extends Encap{
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

	@Test
	public void collect() throws InterruptedException {
		ForEn lis = new ForEn(driver);
		lis.Having();
		/**
		 * 获取文章点击收藏并返回
		 * */
		WebElement text = lis.getAllText().get(0);
		String title=text.getAttribute("name");
		System.out.println(title);
		text.click();
		Thread.sleep(1000);
		lis.guiding();
		
		driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
				+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[3]")).click();
		
		lis.login();
		
		
		
		driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
				+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[3]")).click();
		
		WebElement ret = lis.getAllButton().get(0);
		Assert.assertTrue(ret.isDisplayed());
		ret.click();
		/**
		 * 切换到我的页面
		 * */
		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
						+ "XCUIElementTypeTabBar[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[5]"))
				.click();
		Thread.sleep(1000);
		/**
		 * 点击我的收藏cell
		 * */
		WebElement certification = lis.getAllButton().get(4);
		Assert.assertTrue(certification.isDisplayed());
		System.out.println(certification.getAttribute("name"));
		certification.click();
		Thread.sleep(1000);
		/**
		 * 查看收藏是否已收藏此文章
		 * */
		
		WebElement text1 = lis.getAllText().get(1);
		String title1=text1.getAttribute("name");
		System.out.println(title1);
		Assert.assertEquals(title, title1);
		Thread.sleep(1000);
		

	}

}