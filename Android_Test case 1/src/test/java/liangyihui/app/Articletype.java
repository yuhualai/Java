package liangyihui.app;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import liangyihui.test.Encap;
import liangyihui.test.Public;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Articletype extends Public {

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

	@Test
	// 判断文章类型是普通文章
	public void f() throws InterruptedException, MalformedURLException {
		Encap tal = new Encap(driver);
		tal.Having();
		Thread.sleep(3000);

		// 获取类型
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> type = driver.findElementsById("net.liangyihui.app:id/tv_tag2");
		WebElement subject = type.get(0);
		String value = subject.getAttribute("name");
		System.out.println("这是一篇 ：" + value);

		Thread.sleep(1000);

		// 获取标题断言
		List<WebElement> noteList = driver.findElementsById("net.liangyihui.app:id/item_title");
		WebElement node = noteList.get(0);
		String value1 = node.getAttribute("name");
		System.out.println("title is ：" + value1);
		node.click();
		Thread.sleep(1000);

		tal.guiding();

		Set<String> context = driver.getContextHandles();
		for (String contextName : context) {
			System.out.println(contextName);

		}
		driver.context("WEBVIEW");
		// Thread.sleep(5000);
		WebElement title = driver.findElement(By.className("title"));
		System.out.println(title);
		System.out.println(title.getText());
		Assert.assertEquals(title.getText(), value1);
		Thread.sleep(1000);
		driver.context("NATIVE_APP");
		driver.findElementByClassName("android.widget.ImageButton").click();
		Thread.sleep(1000);

	}

}
