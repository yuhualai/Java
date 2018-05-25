package com.liangyihui.intal;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class intal {
	public WebDriver driver;	

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/Users/yuhualai/Desktop/chromedriver");
		driver = new ChromeDriver();
		String testUrl = "http://www.liangyihui.net";
		driver.get(testUrl);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
