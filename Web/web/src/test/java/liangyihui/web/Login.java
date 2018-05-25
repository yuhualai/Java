package liangyihui.web;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.log4testng.Logger;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public WebDriver driver;
//	public Logger logger = Logger.getLogger(Login.class);

	@BeforeClass
	public void beforeClass() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/yuhualai/Desktop/chromedriver");
		driver = new ChromeDriver();
		String testUrl = "http://www.liangyihui.net";
		driver.get(testUrl);
//		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

	}

	@Test
	public void login() throws InterruptedException {
		String loginElement = "login";
		String uesrnanme = "15921470107";
		String mobileElement = "login1_mobile";
		String uesrpass = "123456";
		String passwordElement = "password";
		Thread.sleep(5000);
		WebElement inputBox = driver.findElement(By.id(loginElement));
		AssertJUnit.assertTrue(inputBox.isDisplayed());
		inputBox.click();
		Thread.sleep(2000);
		// logger.fatal("1.fatal为可能导致应用中止的严重事件错误");
		// logger.error("2.ERROR 为严重错误 主要是程序的错误 ");
		//// logger.warn("3.WARN 为一般警告，比如session丢失 ");
		//// logger.info("4.INFO 为一般要显示的信息，比如登录登出 ");
//		logger.debug("5.DEBUG 为程序的调试信息  ");

		// 登录页面输入手机号
		WebElement login1_mobile = driver.findElement(By.id(mobileElement));
		AssertJUnit.assertTrue(login1_mobile.isDisplayed());
		login1_mobile.sendKeys(uesrnanme);
		String value = login1_mobile.getAttribute("value");
		System.out.println("输入手机号：" + value);
		Thread.sleep(1000);

		// 登录页面输入密码
		WebElement password = driver.findElement(By.name(passwordElement));
		AssertJUnit.assertTrue(password.isDisplayed());
		password.sendKeys(uesrpass);
		String value1 = password.getAttribute("value");
		System.out.println("输入密码：" + value1);
		Thread.sleep(1000);

		// 点击登录，获取文本值
		WebElement login = driver.findElement(By.xpath("html/body/div[10]/div[3]/form[1]/div[4]/button"));
		AssertJUnit.assertTrue(login.isDisplayed());
		login.click();
		String value2 = login.getText();
		System.out.println(value2);
		Thread.sleep(5000);

		// 判断结果是否登录成功
		System.out.println(waitEle(driver));
		Thread.sleep(1000);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	public String waitEle(WebDriver driver) {
		WebElement element = driver.findElement(By.cssSelector(".header_nickname>.header_nickname_text.dotdotdot"));
		String elem = element.getText();
		if (elem.equals("肿瘤_Test")) {
			takeScreenShot();
			return "肿瘤_Test";
		}
		return "失败";
	}

	

	public void takeScreenShot() {
		long data = System.currentTimeMillis();
		String path = String.valueOf(data);
		String curPath = System.getProperty("user.dir");
		path = path + ".png";
		String screenPaht = curPath + "/" + path;
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File(screenPaht));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
