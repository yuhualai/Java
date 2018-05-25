package liangyihui.net;

import org.testng.annotations.Test;

import liangyihui.list.Encap;
import liangyihui.list.ForEn;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Recommended extends Encap{

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

	@Test
	public void recommended() throws InterruptedException {
		
		ForEn lis = new ForEn(driver);
		lis.Having();

		List<String> listString = this.listElement();
		System.out.println(listString.size() + "篇最新资讯");

		for (int i = 0; i < listString.size(); i++) {
			Thread.sleep(1000);
			System.out.println(driver.findElement(By.xpath("//*[contains(text(),'" + listString.get(i) + "')]")).getText());
			WebElement op = driver.findElement(By.xpath("//*[contains(text(),'" + listString.get(i) + "')]"));
			String oi = op.getText();
			System.out.println(oi);
			op.click();
			Thread.sleep(4000);
			String currentWindow = driver.getWindowHandle();// 获取当前窗口句柄
			Set<String> handles = driver.getWindowHandles();// 获取所有窗口句柄
			Iterator<String> it = handles.iterator();
			while (it.hasNext()) {
				if (currentWindow == it.next()) {
					continue;
				}
//				driver = driver.switchTo().window(it.next());// 切换到新窗口
//				WebElement h1 = driver.findElement(By.className("h1-title"));
//				String h2 = h1.getText();
//				AssertJUnit.assertEquals(oi, h2, "这两个标题不一样");
//				driver.close();
			}
			driver.switchTo().window(currentWindow);// 回到原来页面
		}

	}
	public List<String> listElement() {
		List<String> listString = new ArrayList<String>();
		List<WebElement> listElement = driver.findElements(By.className("XCUIElementTypeCell"));
		for (WebElement el : listElement) {
			listString.add(el.findElement(By.className("XCUIElementTypeStaticText")).getText());
			
		}
		return listString;

	}

}