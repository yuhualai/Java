package liangyihui.app;

import org.testng.annotations.Test;

import liangyihui.test.Encap;
import liangyihui.test.Public;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Question_add extends Public{

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
		Thread.sleep(1000);

		driver.findElementById("net.liangyihui.app:id/im_create_question").click();
		Thread.sleep(1000);
		driver.findElementById("net.liangyihui.app:id/et_title").sendKeys("肺癌Test");
		Thread.sleep(1000);

		List<WebElement> lis = driver.findElementsById("net.liangyihui.app:id/tv_type");
		// System.out.println(lis.size());
		for (int i = 0; i < 3; i++) {
			WebElement type = lis.get(i);
			String name = type.getAttribute("name");
			System.out.println(name);
			type.click();
		}
		Thread.sleep(1000);

		driver.findElementById("net.liangyihui.app:id/tv_action").click();
		Thread.sleep(1000);

		driver.findElementById("net.liangyihui.app:id/fl_add_news").click();
		Thread.sleep(1000);

		driver.findElementById("net.liangyihui.app:id/et_search").sendKeys("肺癌");
		Thread.sleep(1000);

		tal.getAllinsert().get(0).click();
		Thread.sleep(1000);

		driver.findElementById("net.liangyihui.app:id/tv_action").click();
		Thread.sleep(1000);

		tal.getAlltitle().get(1).click();
		Thread.sleep(10000);

	}

	public void takeScreenShot() {
		long data = System.currentTimeMillis();
		String path = String.valueOf(data);
		path = path + ".png";
		((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	}

}
