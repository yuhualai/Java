package liangyihui.net;

import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import liangyihui.list.Encap;
import liangyihui.list.ForEn;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.util.List;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Knowledge extends Encap{
	IOSDriver<WebElement> driver;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	/**
	 *知识
	 **/
	public void knowledge() throws InterruptedException {
		ForEn lis = new ForEn(driver);
		lis.Having();
		Thread.sleep(1000);

		WebElement knowledge = driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"
						+ "/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[3]"));
		Assert.assertTrue(knowledge.isDisplayed());
		System.out.println(knowledge.getAttribute("name"));
		knowledge.click();
		

		WebElement Cancer = driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"
						+ "/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]"
						+ "/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[4]"));
		Assert.assertTrue(Cancer.isDisplayed());
		System.out.println(Cancer.getAttribute("name"));
		Cancer.click();
		Thread.sleep(1000);
		List<WebElement> liso = driver.findElementsByClassName("XCUIElementTypeStaticText");
		System.out.println("获取元素" + liso.size());
		for (int i = 0; i < liso.size(); i++) {
			System.out.println(liso.get(i).getText());
		}
		Thread.sleep(2000);

	}

}