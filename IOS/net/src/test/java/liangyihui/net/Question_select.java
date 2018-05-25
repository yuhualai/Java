package liangyihui.net;

import org.testng.annotations.Test;

import liangyihui.list.Encap;
import liangyihui.list.ForEn;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Question_select extends Encap {

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void question() throws InterruptedException {

		ForEn lis = new ForEn(driver);
		lis.Having();

		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTabBar[1]/"
						+ "XCUIElementTypeOther[2]/XCUIElementTypeButton[3]"))
				.click();
		Thread.sleep(1000);

		lis.login();

		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTabBar[1]/"
						+ "XCUIElementTypeOther[2]/XCUIElementTypeButton[3]"))
				.click();
		Thread.sleep(1000);

		lis.guiding2();

		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		List<WebElement> listElement = driver.findElements(By.className("XCUIElementTypeCell"));

		for (int i = 0; i < 5; i++) {
			WebElement list = listElement.get(i);
			List<WebElement> ement = list.findElements(By.className("XCUIElementTypeStaticText"));

			for (int j = 0; j < ement.size() /2; j++) {
				WebElement op = ement.get(j);
				System.out.println(op.getText());

				driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, 200);
			}

		}

	}

}