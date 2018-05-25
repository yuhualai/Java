package liangyihui.app;

import org.testng.annotations.Test;

import liangyihui.test.Encap;
import liangyihui.test.Public;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Subscribe_Hottest extends Public{

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	// 本周最热十篇文章获取标题并分享
	public void hottest() throws InterruptedException {
		Encap tal = new Encap(driver);
		tal.Having();
		Thread.sleep(3000);
		// 点击左上角菜单按钮
		Thread.sleep(2000);
		driver.findElementById("net.liangyihui.app:id/im_subscribe").click();
		Thread.sleep(1000);
		// 点击本周最热
		driver.findElementById("net.liangyihui.app:id/tv_hot").click();
		Thread.sleep(5000);
		// 获取本周最热标题和频道

		Set<String> context = driver.getContextHandles();
		for (String contextName : context) {
			System.out.println(contextName);

		}
		driver.context("WEBVIEW");
		java.util.List<WebElement> Type = driver
				.findElements(By.cssSelector("ul>.news-item>.news-right>.news-title,.news-bottom>.news-tag"));
		System.out.println("本周最热 ：" + Type.size() / 2 + " 篇");
		for (int i = 0; i < Type.size(); i++) {
			System.out.println(Type.get(i).getText());
		}
	}

}
