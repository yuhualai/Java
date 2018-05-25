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

public class Found_consultation extends Public{

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

		// 全球会诊中心
		WebElement title = tal.getAlltitle().get(0);
		Assert.assertTrue(title.isDisplayed());
		String value1 = title.getAttribute("name");
		System.out.println("The module ：" + value1);
		title.click();
		Thread.sleep(5000);

		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, 200);
		Thread.sleep(1000);

		Set<String> context = driver.getContextHandles();
		for (String contextName : context) {
			System.out.println(contextName);

		}
		driver.context("WEBVIEW");
		WebElement More = driver.findElement(By.cssSelector(".diagnosis>.expertRecommend>.header>.more>a"));
		Assert.assertTrue(More.isDisplayed());
		System.out.println(More);
		System.out.println(More.getText());
		More.click();
		Thread.sleep(5000);

		WebElement lis = getAllshow().get(0);
		Assert.assertTrue(lis.isDisplayed());
		System.out.println(lis);
		System.out.println(lis.getText());
		lis.click();
		Thread.sleep(1000);
		// 筛选为“胃癌”
		WebElement list = getAllitem().get(2);
		Assert.assertTrue(list.isDisplayed());
		String value2 = list.getText();
		System.out.println("筛选为 ：" + value2);
		list.click();
		Thread.sleep(1000);

		java.util.List<WebElement> Type = driver.findElements(By.cssSelector("ul>li>.container>.right-info>.intro"));
		System.out.println(value2 + " ：" + Type.size() + " 篇");
		for (int i = 0; i < Type.size(); i++) {
			System.out.println(Type.get(i).getText());
		}

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
