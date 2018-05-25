package liangyihui.app;

import org.testng.annotations.Test;

import liangyihui.test.Encap;
import liangyihui.test.Public;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Public_class extends Public {

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void publiclass() throws InterruptedException {
		Encap tal = new Encap(driver);
		tal.Having();
		Thread.sleep(3000);

		// Thread.sleep(2000);
		driver.findElementById("net.liangyihui.app:id/fl_one").click();
		Thread.sleep(1000);
		List<WebElement> noteList = driver.findElementsById("net.liangyihui.app:id/tv_title");
		WebElement node = noteList.get(1);
		String nodetitle = node.getAttribute("name");
		System.out.println("title is" + nodetitle);
		node.click();
		Thread.sleep(15000);
		Set<String> context = driver.getContextHandles();
		for (String contextName : context) {
			System.out.println(contextName);

		}

		driver.context("WEBVIEW");
		WebElement title = driver.findElement(By.className("title"));
		System.out.println(title);
		System.out.println(title.getText());
		// List<WebElement> boteList =
		// driver.findElementsById("net.liangyihui.app:id/tv_class_name");
		// WebElement bote = boteList.get(0);
		// String botetitle = bote.getAttribute("name");
		// System.out.println("title is" + botetitle);
		Assert.assertEquals(nodetitle, title.getText());
		WebElement video = driver.findElement(By.className("lyhvideo"));
		video.click();
		Thread.sleep(10000);
		// driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]")).click();

		// driver.findElementByClassName("android.webkit.WebView").click();
		// Thread.sleep(10000);
		// driver.findElementById("net.liangyihui.app:id/im_back").click();
		// Thread.sleep(1000);
		// driver.findElementByClassName("android.widget.ImageButton").click();
		// Thread.sleep(5000);

	}

}
