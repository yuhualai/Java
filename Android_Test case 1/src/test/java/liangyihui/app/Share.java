package liangyihui.app;

import org.testng.annotations.Test;

import io.appium.java_client.FindsByAndroidUIAutomator;
import liangyihui.test.Encap;
import liangyihui.test.Public;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Share extends Public{
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test

	public void share() throws InterruptedException {
		Encap tal = new Encap(driver);
		tal.Having();
		Thread.sleep(3000);

		List<WebElement> noteList = driver.findElementsById("net.liangyihui.app:id/item_title");
		WebElement node = noteList.get(0);
		String nodetitle = node.getAttribute("name");
		System.out.println("title is" + nodetitle);
		node.click();
		Thread.sleep(2000);
		driver.findElementById("net.liangyihui.app:id/fl_share").click();
		Thread.sleep(1000);
		driver.findElementById("net.liangyihui.app:id/fl_share").click();
		Thread.sleep(5000);
		Set<String> context = driver.getContextHandles();
		for (String contextName : context) {
			System.out.println(contextName);

		}
		driver.context("WEBVIEW");
		WebElement title = driver.findElement(By.className("title"));
		System.out.println(title);
		System.out.println(title.getText());
		Thread.sleep(1000);

		driver.context("NATIVE_APP");
		driver.findElementById("net.liangyihui.app:id/fl_share").click();
		Thread.sleep(1000);
		driver.findElementById("net.liangyihui.app:id/wechat").click();
		Thread.sleep(1000);

		// driver.findElementById("com.tencent.mm:id/bd2").sendKeys("594279478");
		// Thread.sleep(1000);
		// WebElement op = driver.findElementById("com.tencent.mm:id/bd3");
		// op.click();
		// Thread.sleep(1000);
		// op.sendKeys("yuhualai@.123");
		// Thread.sleep(10000);
		// driver.findElementById("com.tencent.mm:id/bd4").click();
		// Thread.sleep(1000);

		driver.findElementById("com.tencent.mm:id/b82").click();
		Thread.sleep(1000);
		((FindsByAndroidUIAutomator<WebElement>) driver)
				.findElementByAndroidUIAutomator("new UiSelector().text(\"啊来\")").click();
		Thread.sleep(1000);
		driver.findElementById("com.tencent.mm:id/gl").click();
		Thread.sleep(1000);
		driver.findElementById("com.tencent.mm:id/adg").sendKeys("阿来");
		Thread.sleep(1000);
		driver.findElementById("com.tencent.mm:id/ad8").click();
		Thread.sleep(1000);
		driver.findElementById("com.tencent.mm:id/ad8").click();
		Thread.sleep(5000);
		System.out.println("分享成功");

	}
}
