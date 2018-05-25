package liangyihui.app;

import org.testng.annotations.Test;

import liangyihui.test.Encap;
import liangyihui.test.Public;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Subscribe_Collection extends Public{

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@Test
	// 判断收藏的文章在我的收藏里可查看
	public void collection() throws InterruptedException {
		Encap tal = new Encap(driver);
		tal.Having();
		Thread.sleep(3000);
		// 点击查看普通文章详情页面
		Thread.sleep(2000);
		WebElement title = tal.getAlltitle().get(0);
		Assert.assertTrue(title.isDisplayed());
		String value = title.getAttribute("name");
		System.out.println("title is ：" + value);
		title.click();
		Thread.sleep(5000);
		// 点击“收藏”按钮，弹出登录框
		driver.findElementById("net.liangyihui.app:id/im_favorite").click();
		Thread.sleep(1000);
		// 登录账号
		tal.login();

		Thread.sleep(5000);
		// 再次点击收藏按钮，此文章被收藏到我的收藏里
		driver.findElementById("net.liangyihui.app:id/im_favorite").click();
		Thread.sleep(1000);
		// 返回上一层
		driver.findElementByClassName("android.widget.ImageButton").click();
		Thread.sleep(1000);
		// 点击左上角菜单按钮
		driver.findElementById("net.liangyihui.app:id/im_subscribe").click();
		Thread.sleep(1000);
		// 点击“我的收藏”
		driver.findElementById("net.liangyihui.app:id/tv_my_collection").click();
		Thread.sleep(1000);
		// 查看我的收藏与之前点击收藏文章断言是否一致
		WebElement title1 = tal.getAlltitle().get(0);
		Assert.assertTrue(title1.isDisplayed());
		String value1 = title1.getAttribute("name");
		System.out.println("title is ：" + value1);
		Assert.assertEquals(value, value1);
		Thread.sleep(1000);
	}

}
