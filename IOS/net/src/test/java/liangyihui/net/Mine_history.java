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

public class Mine_history extends Encap{

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void history() throws InterruptedException {
		ForEn lis = new ForEn(driver);
		lis.Having();
		/**
		 * 查看普通文章
		 * */
		WebElement text = lis.getAllText().get(0);
		String title=text.getAttribute("name");
		System.out.println(title);
		text.click();
		Thread.sleep(1000);
		
		lis.guiding();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
				+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[3]")).click();
		
		lis.login();
		Thread.sleep(1000);

						
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
		 * 点击我的阅读历史cell
		 * */
		WebElement certification = lis.getAllButton().get(5);
		Assert.assertTrue(certification.isDisplayed());
		System.out.println(certification.getAttribute("name"));
		certification.click();
		Thread.sleep(1000);
		/**
		 * 查看阅读历史记录是否记录此文章
		 * */
		
		WebElement text1 = lis.getAllText().get(2);
		String title1=text1.getAttribute("name");
		System.out.println(title1);
		Assert.assertEquals(title, title1);
		Thread.sleep(1000);
		

	}

}