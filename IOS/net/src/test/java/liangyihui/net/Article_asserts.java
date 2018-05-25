package liangyihui.net;

import org.testng.annotations.Test;

import liangyihui.list.Encap;
import liangyihui.list.ForEn;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Article_asserts extends Encap {

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

	@Test
	public void tic() throws InterruptedException {
		ForEn lis = new ForEn(driver);
		lis.Having();

		// WebElement type = lis.getAllText().get(1);
		// String typetitle = type.getAttribute("name");
		// System.out.println("这是一篇：" + typetitle);
		// Assert.assertNotNull(typetitle);

		WebElement node = lis.getAllText().get(0);
		String nodetitle = node.getAttribute("name");
		System.out.println("title is" + nodetitle);
		node.click();
		Thread.sleep(2000);

		lis.guiding();

		WebElement node1 = lis.getAllText().get(2);
		String nodetitle1 = node1.getAttribute("name");
		System.out.println("title is" + nodetitle1);
		Assert.assertEquals(nodetitle1, nodetitle);
		Thread.sleep(1000);
		driver.findElementByClassName("XCUIElementTypeButton").click();
		Thread.sleep(1000);
	}
}