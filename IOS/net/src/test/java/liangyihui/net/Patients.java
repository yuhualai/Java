package liangyihui.net;


import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import liangyihui.list.Encap;
import liangyihui.list.ForEn;

public class Patients extends Encap{

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	@Test
	public void patients() throws InterruptedException {
		ForEn lis = new ForEn(driver);
		lis.Having();

		driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTabBar[1]/"
						+ "XCUIElementTypeOther[2]/XCUIElementTypeButton[4]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
				+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")).click();

		lis.login();
		
		
		
		
	}
	
	

}