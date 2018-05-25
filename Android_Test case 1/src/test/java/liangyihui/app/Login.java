package liangyihui.app;

import org.testng.annotations.Test;
import liangyihui.test.Encap;
import liangyihui.test.Public;
import java.net.MalformedURLException;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Login extends Public {

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	@Test
	public void login() throws InterruptedException, MalformedURLException {
		Encap tal = new Encap(driver);
		tal.Having();
		Thread.sleep(3000);
		
		WebElement subject = tal.getAlltv_tab_title().get(7);
		subject.click();
		Thread.sleep(1000);
		driver.findElementById("net.liangyihui.app:id/rl_my_verify").click();
		Thread.sleep(1000);

		tal.login();
		Thread.sleep(1000);

		WebElement loginname = driver.findElementById("net.liangyihui.app:id/tv_name");
		Assert.assertTrue(loginname.isDisplayed());
		String value = loginname.getAttribute("name");
		if (value.equals("肿瘤_Test")) {
			System.out.println("登录成功");
		} else {
			System.out.println("登录失败");
		}
		Thread.sleep(5000);
		
	}

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

}
