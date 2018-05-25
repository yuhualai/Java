package liangyihui.web;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Factory;
import static org.testng.ConversionUtils.wrapDataProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.util.Arrays;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class CHH {
	@Factory
	public static Object[] factoryPrepareData() {
		return wrapDataProvider(CHH.class, prepareData());
	}

	private static WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/Users/yuhualai/Desktop/chromedriver");
		driver = new ChromeDriver();
		String testUrl = "http://www.liangyihui.net";
		driver.get(testUrl);
		driver.manage().window().maximize();
	}

	private String username;
	private String password;

	public CHH(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Parameters
	public static Collection<Object[]> prepareData() {
		Object[][] object = { { "18900000009", "123456" }, { "15921470107", "123456" } };
		return Arrays.asList(object);
	}

	@Test
	public void f() throws InterruptedException {
		WebElement inputBox = driver.findElement(By.id("login"));
		AssertJUnit.assertTrue(inputBox.isDisplayed());
		inputBox.click();
		Thread.sleep(2000);
		// 登
		WebElement login1_mobile = driver.findElement(By.id("login1_mobile"));
		// 登录页面输入密码
		WebElement passwo = driver.findElement(By.name("password"));
		login1_mobile.clear();
		login1_mobile.sendKeys(username);
		passwo.sendKeys(password);

		Thread.sleep(1000);

		// 点击登录，获取文本值
		WebElement login = driver.findElement(By.xpath("html/body/div[10]/div[3]/form[1]/div[4]/button"));
		AssertJUnit.assertTrue(login.isDisplayed());
		login.click();
		String value2 = login.getText();
		System.out.println(value2);
		Thread.sleep(5000);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
