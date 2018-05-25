package liangyihui.app;

import org.testng.annotations.Test;

import liangyihui.test.Encap;
import liangyihui.test.Public;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Question_select extends Public{

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void add() throws InterruptedException {
		Encap tal = new Encap(driver);
		tal.Having();
		Thread.sleep(3000);

		tal.getAlltab().get(2).click();
		Thread.sleep(1000);

		driver.findElementById("net.liangyihui.app:id/btn_certify").click();
		Thread.sleep(1000);

		tal.login();
		Thread.sleep(1000);

		tal.getAlltab().get(2).click();
		Thread.sleep(1000);
		
		tal.guiding2();

		// int width = driver.manage().window().getSize().width;
		// int height = driver.manage().window().getSize().height;
		List<WebElement> lis = driver.findElementsById("net.liangyihui.app:id/tv_title");
		for (int i = 0; i < 5; i++) {
			WebElement type = lis.get(i);
			String name = type.getAttribute("name");
			System.out.println(name);
			type.click();
			Thread.sleep(1000);

			Set<String> context = driver.getContextHandles();
			for (String contextName : context) {
				System.out.println(contextName);

			}
			driver.context("WEBVIEW");
			WebElement title = driver.findElement(By.className("title"));
			System.out.println(title);
			System.out.println(title.getText());
			Assert.assertEquals(title.getText(), name);
			Thread.sleep(1000);
			driver.context("NATIVE_APP");
			driver.findElementByClassName("android.widget.ImageButton").click();
			Thread.sleep(1000);

			// driver.swipe(width / 2, height * 2 / 3, width / 2, height / 3,
			// 200);
			// Thread.sleep(1000);
		}

	}

}
