package liangyihui.net;

import org.testng.annotations.Test;

import liangyihui.list.Encap;
import liangyihui.list.ForEn;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Comments extends Encap {

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	/**
	 * 评论
	 **/
	@Test
	public void comments() throws InterruptedException {
		ForEn lis = new ForEn(driver);
		lis.Having();
		Thread.sleep(1000);
			
		WebElement comments = driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"
						+ "/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
						+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/"
						+ "XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
		Assert.assertTrue(comments.isDisplayed());
		System.out.println(comments.getAttribute("name"));
		comments.click();
		Thread.sleep(3000);
		
		lis.guiding();
		Thread.sleep(1000);


		WebElement cancer = driver.findElementByName("参与讨论...");
		Assert.assertTrue(cancer.isDisplayed());
		System.out.println(cancer.getAttribute("name"));
		cancer.click();
		Thread.sleep(2000);

		lis.login();

		Thread.sleep(2000);
		cancer.click();
		Thread.sleep(1000);

		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeImage[1]"))
				.sendKeys("文章写得很好");
		Thread.sleep(2000);

		driver.findElementByName("发送").click();
		Thread.sleep(5000);
		System.out.println("评论成功");

	}


}