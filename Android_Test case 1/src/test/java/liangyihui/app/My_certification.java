package liangyihui.app;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class My_certification extends Login{
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}
	
	@AfterClass
	public void afterClass() {
		super.afterClass();
	}
	
	@Test
	public void login() throws MalformedURLException, InterruptedException {
		super.login();
		Thread.sleep(1000);
		
		WebElement ver = driver.findElementById("net.liangyihui.app:id/tv_my_verify");
		String namever = ver.getAttribute("name");
		if (namever.equals("待审核")) {
			System.out.println("待审核状态");
		} else if (namever.equals("认证被拒")) {
			System.out.println("认证被拒");
		} else if (namever.equals("已认证")) {
			System.out.println("已认证");
		} else {
			System.out.println("未认证");
		}
	}

}
