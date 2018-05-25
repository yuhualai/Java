package com.liangyihui.intal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Encapsulation implements IPint{
	public WebDriver driver;
	public Encapsulation(WebDriver driver){
		this.driver = driver;
	}
	
	
	public void Login() throws InterruptedException{
		
		driver.findElement(By.id("login")).click();

		Thread.sleep(2000);
		WebElement user = driver.findElement(By.id("login1_mobile"));

		Assert.assertTrue(user.isDisplayed());
		user.sendKeys("18900000009");
		String value = user.getAttribute("value");
		System.out.println("输入手机号：" + value);

		Thread.sleep(1000);
		WebElement passwor = driver.findElement(By.name("password"));
		
		Assert.assertTrue(passwor.isDisplayed());
		passwor.sendKeys("123456");
		String value1 = passwor.getAttribute("value");
		System.out.println("输入密码：" + value1);

		Thread.sleep(1000);

		WebElement login = driver.findElement(By.xpath("html/body/div[10]/div[3]/form[1]/div[4]/button"));
		Assert.assertTrue(login.isDisplayed());
		login.click();
	
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.cssSelector(".header_nickname>.header_nickname_text.dotdotdot"));
		String name = element.getText();
		if (name.equals("肿瘤_Test")) {
			System.out.println("登录成功");
		} else {
			System.out.println("登录失败");
		}

		/**
		 * 移动到名称位置
		 */
		 Actions actions = new Actions(driver);
		 actions.moveToElement(element).perform();
		 Thread.sleep(5000);
		 driver.close();
		
	}

}
