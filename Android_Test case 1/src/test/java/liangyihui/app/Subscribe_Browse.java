package liangyihui.app;

import org.testng.annotations.Test;
import liangyihui.test.Encap;
import liangyihui.test.Public;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.util.Set;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Subscribe_Browse extends Public{

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}
	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

	@Test
	// 分类浏览访问并订阅
	public void browse() throws InterruptedException {
		Encap tal = new Encap(driver);
		tal.Having();
		Thread.sleep(3000);
		// 点击左上角菜单按钮
		Thread.sleep(2000);
		driver.findElementById("net.liangyihui.app:id/im_subscribe").click();
		Thread.sleep(1000);
		// 点击分类浏览页
		WebElement title = tal.getAllname().get(1);
		Assert.assertTrue(title.isDisplayed());
		String value = title.getAttribute("name");
		System.out.println("title is ：" + value);
		title.click();
		Thread.sleep(5000);

		Set<String> context = driver.getContextHandles();
		for (String contextName : context) {
			System.out.println(contextName);

		}
		driver.context("WEBVIEW");
		java.util.List<WebElement> Type = driver.findElements(By.cssSelector("ul>.news-item>.news-right>.news-title"));
		System.out.println(value + " ：" + Type.size() + " 篇" + "(未下拉获取列表)");
		System.out.println("===============================================");
		for (int i = 0; i < Type.size(); i++) {
			System.out.println(Type.get(i).getText());
		}
		Thread.sleep(1000);

		// 切换到NATIVE_APP
		driver.context("NATIVE_APP");
		// 点击“订阅”按钮
		driver.findElementById("net.liangyihui.app:id/tv_action").click();
		Thread.sleep(1000);
		// 登录账号
		tal.login();
		// 再次点击“订阅”按钮
		driver.findElementById("net.liangyihui.app:id/tv_action").click();
		WebElement action = driver.findElementById("net.liangyihui.app:id/tv_action");
		Assert.assertTrue(action.isDisplayed());
		String value1 = action.getAttribute("name");
		System.out.println("成功订阅 ：" + value1);
		Thread.sleep(1000);
		// 返回上一层
		driver.findElementByClassName("android.widget.ImageButton").click();
		Thread.sleep(1000);

	}

}
