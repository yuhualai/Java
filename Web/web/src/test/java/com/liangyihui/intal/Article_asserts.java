package com.liangyihui.intal;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Article_asserts extends intal{

	@BeforeClass
	public void beforeClass() {
		super.beforeClass();

	}

	@Test
	public void article(){
		WebElement list = getAlllist().get(1);
		AssertJUnit.assertTrue(list.isDisplayed());
		String value = list.getText();
		System.out.println("title is ：" + value);
		list.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		java.util.List<WebElement> links = driver.findElements(
				By.cssSelector(".block_unit_wrapper.block_unit_news>.block_unit>.block_unit_right>.block_unit_title"));//.block_unit_wrapper.block_unit_news>.block_unit>.block_unit_right>.block_unit_title
		WebElement list1 = links.get(0);
		AssertJUnit.assertTrue(list1.isDisplayed());
		String value1 = list1.getText();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println("title is ：" + value1);
		list1.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();

		String currentWindow = driver.getWindowHandle();// 获取当前窗口句柄
		Set<String> handles = driver.getWindowHandles();// 获取所有窗口句柄
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			if (currentWindow == it.next()) {
				continue;
			}
			driver = driver.switchTo().window(it.next());// 切换到新窗口

			// 判断文章标题是否一致
			WebElement userName = driver.findElement(By.xpath("html/body/div[2]/div[2]/h1"));
			AssertJUnit.assertTrue(userName.isDisplayed());
			String value2 = userName.getText();
			System.out.println("title is ：" + value2);
//			AssertJUnit.assertEquals(value1, value2, "这两个值不一样");

			// 判断文章类型，并不能为空
			WebElement channel = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[2]/div[2]/span[1]"));
			AssertJUnit.assertTrue(channel.isDisplayed());
			String value3 = channel.getText();
			System.out.println("这是一篇 ：" + value3);
			Assert.assertNotNull(value3);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[7]/span")).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		driver.switchTo().window(currentWindow);// 回到原来页面

	}

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

	public List<WebElement> getAlllist() {
		List<WebElement> lis = driver.findElements(By.cssSelector(".header_nav_section>a"));
		return lis;
	}
	

}
