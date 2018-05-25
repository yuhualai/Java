package liangyihui.app;

import org.testng.annotations.Test;

import liangyihui.test.Encap;
import liangyihui.test.Public;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.util.List;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Found_Academic extends Public{

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

	@Test
	public void f1() throws InterruptedException {

		Encap tal = new Encap(driver);
		tal.Having();
		Thread.sleep(3000);

		Thread.sleep(2000);
		WebElement subject = tal.getAlltab().get(1);
		Assert.assertTrue(subject.isDisplayed());
		String value = subject.getAttribute("name");
		System.out.println("Tab is ：" + value + "发现");
		subject.click();
		Thread.sleep(1000);

		WebElement title = tal.getAlltitle().get(2);
		Assert.assertTrue(title.isDisplayed());
		String value1 = title.getAttribute("name");
		System.out.println("The module ：" + value1);
		title.click();
		Thread.sleep(5000);

		List<WebElement> lis = driver.findElementsById("net.liangyihui.app:id/item_title");
		System.out.println("学术会议：" + lis.size() + " 篇");

		for (int i = 0; i < lis.size(); i++) {
			System.out.println(lis.get(i).getAttribute("name"));
		}
		

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
