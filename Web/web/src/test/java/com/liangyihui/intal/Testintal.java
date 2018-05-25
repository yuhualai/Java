package com.liangyihui.intal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.liangyihui.net.DriverBase;

import org.testng.annotations.BeforeClass;

public class Testintal{
	public DriverBase driver;
	@BeforeClass
	public void beforeClass() {
		this.driver = new DriverBase("chrome");
		String testUrl = "http://www.liangyihui.net";
		driver.get(testUrl);
//		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}

	@Test
	public void Test() {
		
		driver.findElement(By.id("login")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/**
		 * 
		 * 登录页面输入手机号
		 **/
//		WebElement user = element(byStr(IdBy, mobileElement));
		WebElement user = driver.findElement(By.id("login1_mobile"));

		Assert.assertTrue(user.isDisplayed());
		user.sendKeys("18900000009");
		String value = user.getAttribute("value");
		System.out.println("输入手机号：" + value);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/**
		 * 登录页面输入密码
		 ***/
//		WebElement passwor = element(byStr(NameBy, passwordElement));
		WebElement passwor = driver.findElement(By.name("password"));
		
		Assert.assertTrue(passwor.isDisplayed());
		passwor.sendKeys("123456");
		String value1 = passwor.getAttribute("value");
		System.out.println("输入密码：" + value1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/**
		 * 点击登录，获取文本值
		 ***/
//		WebElement login = driver.findElement(By.xpath("html/body/div[10]/div[3]/form[1]/div[4]/button"));
//		WebElement login = driver.findElement(By.xpath("//*[contains(text(),'登录')]"));
		WebElement login = driver.findElement(By.cssSelector("#login1_form > div:nth-child(4) > button"));



		Assert.assertTrue(login.isDisplayed());
		login.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement element = driver.findElement(By.cssSelector(".header_nickname>.header_nickname_text.dotdotdot"));
		String name = element.getText();
		if (name.equals("肿瘤_Test")) {
			System.out.println("登录成功");
		} else {
			System.out.println("登录失败");
		}
	}
	@AfterClass 
	public void afterClass() {
		driver.close();
	}


}
