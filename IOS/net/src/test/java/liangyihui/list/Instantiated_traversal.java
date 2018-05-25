package liangyihui.list;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class Instantiated_traversal {
	IOSDriver<WebElement> driver;
	
	public Instantiated_traversal(IOSDriver<WebElement> driver){
		this.driver=driver;

	}

	@Test
	/**
	 * 
	 * 实例化专题遍历
	 * **/
	public  void traversal() throws InterruptedException {
		ForEn lis = new ForEn(driver);
		List<WebElement> listElement = driver.findElements(By.className("XCUIElementTypeCell"));

		for (int i = 0; i < 2; i++) {
			WebElement list = listElement.get(i);
			List<WebElement> ement = list.findElements(By.className("XCUIElementTypeStaticText"));

			for (int j = 0; j < ement.size() / 3; j++) {
				WebElement op = ement.get(j);

				System.out.println(op.getText());
				op.click();
				Thread.sleep(2000);
				WebElement type = lis.getAllButton().get(0);
				type.click();
			}

		}
	}
	/**
	 * 
	 * 实例化专栏遍历
	 * **/
	public void sal() throws InterruptedException {
		ForEn lis = new ForEn(driver);
		List<WebElement> listElement = driver.findElements(By.className("XCUIElementTypeOther"));

		for (int i = 0; i < 4; i++) {
			WebElement list = listElement.get(i);
			System.out.println(list.getText());
			List<WebElement> ement = list.findElements(By.className("XCUIElementTypeStaticText"));
			for (int j = 0; j < ement.size() / 4; j++) {
				WebElement op = ement.get(j);

				System.out.println(op.getText());
				op.click();
				Thread.sleep(2000);
				WebElement type = lis.getAllButton().get(0);
				type.click();
			}

		}
	}
}
