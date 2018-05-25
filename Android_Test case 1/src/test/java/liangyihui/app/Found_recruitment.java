package liangyihui.app;

import org.testng.annotations.Test;

import liangyihui.test.Encap;
import liangyihui.test.Public;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Found_recruitment extends Public{

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void f1() throws InterruptedException {
		Encap tal = new Encap(driver);
		tal.Having();
		Thread.sleep(3000);
		
		WebElement subject = tal.getAlltab().get(1);
		Assert.assertTrue(subject.isDisplayed());
		String value = subject.getAttribute("name");
		System.out.println("Tab is ：" + value + "发现");
		subject.click();
		Thread.sleep(1000);

		WebElement title = tal.getAlltitle().get(1);
		Assert.assertTrue(title.isDisplayed());
		String value1 = title.getAttribute("name");
		System.out.println("The module ：" + value1);
		title.click();
		Thread.sleep(5000);

		Set<String> context = driver.getContextHandles();
		for (String contextName : context) {
			System.out.println(contextName);

		}
		driver.context("WEBVIEW");
		WebElement title1 = driver.findElement(By.cssSelector(".wx-app>div>#app>div>.selects>.pdselect>.showtitle"));
		Assert.assertTrue(title1.isDisplayed());
		System.out.println(title1);
		System.out.println(title1.getText());
		title1.click();
		Thread.sleep(5000);
		// 筛选为“胃癌”
		WebElement list = getAllselect().get(1);
		Assert.assertTrue(list.isDisplayed());
		String value2 = list.getText();
		System.out.println("筛选为 ：" + value2);
		list.click();
		Thread.sleep(5000);

		WebElement title2 = driver
				.findElement(By.cssSelector(".listStyle>.list>.news-item>.news-right>.news-bottom>.news-tag"));
		Assert.assertTrue(title2.isDisplayed());
		System.out.println(title2);
		System.out.println("这是一篇：" + title2.getText());
		Thread.sleep(1000);

		WebElement title3 = driver.findElement(By.cssSelector(".listStyle>.list>.news-item>.news-right>.news-title"));
		Assert.assertTrue(title3.isDisplayed());
		System.out.println(title3);
		System.out.println(title3.getText());
		title3.click();
		Thread.sleep(5000);

	}

	public List<WebElement> getAllselect() {
		java.util.List<WebElement> links = driver.findElements(
				By.cssSelector(".wx-app>div>#app>div>.selects>.pdselect>.popup>.selectform>.select_item"));
		return links;
	}

	public List<WebElement> getAllshow() {
		java.util.List<WebElement> links = driver
				.findElements(By.cssSelector(".wx-app>div>#app>div>div>.selects>.pdselect>.showtitle"));
		return links;
	}

	public List<WebElement> getAllitem() {
		java.util.List<WebElement> links = driver.findElements(
				By.cssSelector(".wx-app>div>#app>div>div>.selects>.pdselect>.popup>.selectform>.select_item"));
		return links;
	}

}
