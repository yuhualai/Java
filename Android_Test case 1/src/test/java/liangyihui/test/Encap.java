package liangyihui.test;

import java.util.List;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class Encap implements IPinter {
	public AndroidDriver<WebElement> driver;

	public Encap(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}

	@Override
	public void Having() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElementById("net.liangyihui.app:id/btn_go").click();
		driver.findElementById("net.liangyihui.app:id/btn_go").click();
		Thread.sleep(3000);

		driver.findElementById("net.liangyihui.app:id/tv_type_std").click();
		Thread.sleep(1000);
		driver.findElementById("net.liangyihui.app:id/tv_save").click();

	}

	@Override
	public void login() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElementById("net.liangyihui.app:id/et_tele").sendKeys("18900000009");
		Thread.sleep(1000);

		driver.findElementById("net.liangyihui.app:id/et_pwd").sendKeys("123456");
		Thread.sleep(1000);

		driver.findElementById("net.liangyihui.app:id/btn_login").click();

	}

	@Override
	public void guiding() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElementById("net.liangyihui.app:id/im_news_share").click();
		Thread.sleep(1000);

		driver.findElementById("net.liangyihui.app:id/im_news_share").click();
		Thread.sleep(1000);
	}
	
	@Override
	public void guiding2() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElementById("net.liangyihui.app:id/im_plus").click();
		Thread.sleep(1000);
		driver.findElementById("net.liangyihui.app:id/im_plus").click();
		Thread.sleep(1000);
		driver.findElementById("net.liangyihui.app:id/im_plus").click();
		Thread.sleep(1000);
	}

	@Override
	public List<WebElement> getAlltab() {
		// TODO Auto-generated method stub
		List<WebElement> lis = driver.findElementsById("net.liangyihui.app:id/ll_tap");
		return lis;
	}

	@Override
	public List<WebElement> getAlltv_tab_title() {
		// TODO Auto-generated method stub
		List<WebElement> lis = driver.findElementsById("net.liangyihui.app:id/tv_tab_title");
		return lis;
	}

	@Override
	public List<WebElement> getAlltitle() {
		// TODO Auto-generated method stub
		List<WebElement> lis = driver.findElementsById("net.liangyihui.app:id/tv_title");
		return lis;
	}

	@Override
	public List<WebElement> getAllinsert() {
		// TODO Auto-generated method stub
		List<WebElement> lis = driver.findElementsById("net.liangyihui.app:id/tv_insert");
		return lis;
	}

	@Override
	public List<WebElement> getAllname() {
		// TODO Auto-generated method stub
		List<WebElement> title = driver.findElementsById("net.liangyihui.app:id/material_drawer_name");
		return title;
	}




}
