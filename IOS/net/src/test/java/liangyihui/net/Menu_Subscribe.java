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

public class Menu_Subscribe extends Encap {

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void subscribe() throws InterruptedException {
		ForEn lis = new ForEn(driver);
		lis.Having();

		WebElement but = lis.getAllButton().get(0);
		but.click();
		Thread.sleep(1000);
		driver.findElement(By.name("订阅管理")).click();
		Thread.sleep(1000);

		WebElement tuo = lis.getAllButton().get(3);
		tuo.click();
		Thread.sleep(1000);
		lis.login();
		Thread.sleep(1000);

		List<WebElement> listElement = driver.findElements(By.className("XCUIElementTypeCell"));
		for (int i = 0; i < 9; i++) {
			WebElement list = listElement.get(i);
			List<WebElement> text = list.findElements(By.className("XCUIElementTypeStaticText"));
			List<WebElement> ement = list.findElements(By.className("XCUIElementTypeButton"));
			for (int j = 0; j < ement.size(); j++) {
				WebElement xt = text.get(j);
				WebElement op = ement.get(j);
				System.out.println(xt.getText());
				System.out.println(op.getText());
				op.click();
			}

		}

	}

}