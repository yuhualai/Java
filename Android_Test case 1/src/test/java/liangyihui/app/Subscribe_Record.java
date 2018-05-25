package liangyihui.app;

import org.testng.annotations.Test;

import liangyihui.test.Encap;
import liangyihui.test.Public;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Subscribe_Record extends Public{

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	// 历史记录
	public void record() throws InterruptedException {
		Encap tal = new Encap(driver);
		tal.Having();
		Thread.sleep(3000);
		WebElement title = tal.getAlltitle().get(0);
		Assert.assertTrue(title.isDisplayed());
		String value = title.getAttribute("name");
		System.out.println("title is ：" + value);
		title.click();
		driver.findElementByClassName("android.widget.ImageButton").click();
		Thread.sleep(1000);
		driver.findElementById("net.liangyihui.app:id/im_subscribe").click();
		Thread.sleep(1000);

		driver.findElementById("net.liangyihui.app:id/tv_read_history").click();
		Thread.sleep(5000);

		WebElement title1 = tal.getAlltitle().get(0);
		Assert.assertTrue(title1.isDisplayed());
		String value1 = title1.getAttribute("name");
		System.out.println("title is ：" + value1);
		Assert.assertEquals(title1, title);
		Thread.sleep(1000);
	}

}
