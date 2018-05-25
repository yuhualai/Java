package com.liangyihui.intal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testtest {
	public WebDriver driver;	

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/Users/yuhualai/Desktop/chromedriver");
		driver = new ChromeDriver();
		String testUrl = "http://www.baidu.com";
		driver.get(testUrl);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}

	@Test
	public void Test() throws InterruptedException {
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id='kw']")).sendKeys("22222");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@value='百度一下']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'新闻')]")).click();
//		driver.findElement(By.xpath("//*[@text='新闻']"));  //执行失败
	    System.out.println(driver.getPageSource());
		

		Thread.sleep(4000);


	}

	@AfterClass 
	public void afterClass() {
		driver.quit();
	}


}
