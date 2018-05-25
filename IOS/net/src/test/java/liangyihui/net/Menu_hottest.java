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

public class Menu_hottest extends Encap{

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

	@Test
	public void hottest() throws InterruptedException {
		ForEn lis = new ForEn(driver);
		lis.Having();

		WebElement but =lis.getAllButton().get(0);
		but.click();
		Thread.sleep(1000);
		driver.findElement(By.name("本周最热")).click();
		Thread.sleep(1000);

		List<WebElement> listElement = driver.findElements(By.className("XCUIElementTypeCell"));

		for (int i = 0; i < listElement.size(); i++) {
			WebElement list = listElement.get(i);
			List<WebElement> ement = list.findElements(By.className("XCUIElementTypeStaticText"));

			for (int j = 0; j < ement.size() / 3; j++) {
				WebElement op = ement.get(j);

				System.out.println(op.getText());
				op.click();
				Thread.sleep(2000);
				WebElement type =lis.getAllButton().get(0);
				type.click();

			}

		}	

	}
	

}