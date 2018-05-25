package liangyihui.net;

import org.testng.annotations.Test;

import liangyihui.list.Encap;
import liangyihui.list.ForEn;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class Cases extends Encap{
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

	@Test
	public void cases() throws InterruptedException {

		ForEn lis = new ForEn(driver);
		lis.Having();

		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"
						+ "/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/"
						+ "XCUIElementTypeButton[4]"))
				.click();

		Thread.sleep(1000);

//		lis.getAllText().get(1).click();
//		Thread.sleep(1000);
//		
//		lis.getAllOther().get(0).click();
//		Thread.sleep(1000);
//		lis.login();



	}

	

}