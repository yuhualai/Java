package liangyihui.net;

import org.testng.annotations.Test;

import liangyihui.list.Encap;
import liangyihui.list.ForEn;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;


public class Column extends Encap{

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

	@Test
	public void column() throws InterruptedException {
		ForEn lis = new ForEn(driver);
		lis.Having();
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"
						+ "/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/"
						+ "XCUIElementTypeButton[2]"))
				.click();
		Thread.sleep(3000);

		lis.getAllText().get(1).click();	
		Thread.sleep(3000);
		WebElement col= driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
		col.click();
		Thread.sleep(1000);
		
		lis.login();
		Thread.sleep(3000);
		
		col.click();
		String value = col.getAttribute("name");
		System.out.println(value);
		Thread.sleep(1000);
		
		if (value.equals("已订阅")) {
			System.out.println("订阅成功");
		} else {
			System.out.println("订阅失败");
		}
		Thread.sleep(2000);

		

			
	}


}