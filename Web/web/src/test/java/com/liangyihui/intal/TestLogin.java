package com.liangyihui.intal;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestLogin extends intal {
	
	@BeforeClass
	public void beforeClass() {
		super.beforeClass();
	}

	@Test
	public void Test() {
		List<String> listString = this.listElement();
		System.out.println(listString.size() + "篇最新资讯");
		for (int i = 0; i < listString.size(); i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement op = driver.findElement(By.xpath("//*[contains(text(),'" + listString.get(i) + "')]"));
			String oi = op.getText();
			System.out.println(oi);
			op.click();
			String currentWindow = driver.getWindowHandle();// 获取当前窗口句柄
			Set<String> handles = driver.getWindowHandles();// 获取所有窗口句柄
			Iterator<String> it = handles.iterator();
			while (it.hasNext()) {
				if (currentWindow == it.next()) {
					continue;
				}
				driver = driver.switchTo().window(it.next());// 切换到新窗口
				WebElement h1 = driver.findElement(By.className("h1-title"));
				String h2 = h1.getText();
				Assert.assertEquals(oi, h2, "两个值不一样");
				driver.close();
			}
			driver.switchTo().window(currentWindow);// 回到原来页面
		}

	}

	public List<String> listElement() {
		List<String> listString = new ArrayList<String>();
		WebElement element = driver.findElement(By.cssSelector(".block_unit_wrapper.block_unit_news"));
		List<WebElement> listElement = element.findElements(By.className("block_unit"));

		for (WebElement el : listElement) {
			listString.add(el.findElement(By.className("block_unit_title")).getText());
		}
		return listString;

	}

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

}
