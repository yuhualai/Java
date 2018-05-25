package liangyihui.net;

import org.testng.annotations.Test;

import liangyihui.list.ForEn;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Mine_dynamic extends Login{
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

	@Test
	public void login() throws InterruptedException {	
		super.login();
		ForEn lis = new ForEn(driver);

		WebElement certification = lis.getAllButton().get(1);
		Assert.assertTrue(certification.isDisplayed());
		System.out.println(certification.getAttribute("name"));
		certification.click();
		Thread.sleep(1000);
		
		

	}

}