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
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Search {
	public WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/yuhualai/Desktop/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		String testUrl = "http://www.liangyihui.net";

		driver.get(testUrl);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND + "t");
		System.out.println(driver.getTitle());

	}

	@Test
	public void search() throws InterruptedException {
		// 搜索"癌症"
		Thread.sleep(3000);
		WebElement inputBox = driver.findElement(By.id("inputBox"));
		AssertJUnit.assertTrue(inputBox.isDisplayed());// 使用Assert类的assertTrue方法断言搜索输入框是否在页面显示
													// isDisplayed方法根据页面元素的显示状态返回判断值，在页面显示则返回true,不显示则返回false
		inputBox.sendKeys("癌症");
		String value = inputBox.getAttribute("value");
		System.out.println("搜索输入: " + value);
		Thread.sleep(1000);
		// 点击搜索
		WebElement formBtn = driver.findElement(By.id("formBtn"));
		AssertJUnit.assertTrue(formBtn.isDisplayed());
		String value1 = formBtn.getText();
		formBtn.click();
		System.out.println(value1);
		Thread.sleep(5000);

		String currentWindow = driver.getWindowHandle();// 获取当前窗口句柄
		Set<String> handles = driver.getWindowHandles();// 获取所有窗口句柄
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			if (currentWindow == it.next()) {
				continue;
			}
			driver = driver.switchTo().window(it.next());// 切换到新窗口

			// 搜索带有"癌症"的文章
			java.util.List<WebElement> block = driver.findElements(
					By.cssSelector(".block_unit_wrapper.block_unit_news>a>.block_unit_right>.block_unit_title"));
			for (int i = 0; i < 1; i++) {
				WebElement list = block.get(i);
				AssertJUnit.assertTrue(list.isDisplayed());
				String value2 = list.getText();
				System.out.println("title is ：" + value2);
				AssertJUnit.assertTrue(isContentAppeared(driver, "癌症"));
				Thread.sleep(1000);
			}

		}
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	public boolean isContentAppeared(WebDriver driver, String content) {
		boolean status = false;
		try {
			driver.findElement(By.xpath("//*[contains(.,'" + content + "')]"));
			System.out.println(content + " " + "已找到");
			status = true;
		} catch (NoSuchElementException e) {
			status = false;
			System.out.println(content + " " + "没有找到");
		}
		return status;
	}

}
