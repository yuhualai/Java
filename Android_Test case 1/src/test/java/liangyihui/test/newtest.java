package liangyihui.test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class newtest {
	public AndroidDriver<WebElement> driver;

	@BeforeClass
	public void beforeClass() throws MalformedURLException,RuntimeException {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "G2W0215A14001671");
		cap.setCapability("platformVersion", "6.0");
		cap.setCapability("appPackage", "com.myball.ctbcbank.uat");
//		cap.setCapability("appActivity", "com.dop.h_doctor.ui.splash.IntroActivity");

		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", "/Users/yuhualai/Desktop/_20180102_UAT.apk");
		cap.setCapability("unicodeKeyboard", true);
		cap.setCapability("reseKeyboard", true);

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	}
	@Test
	public void f1() throws InterruptedException {
		
//启动后等待4秒
		Thread.sleep(4000);
//滑动动画效果一次
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width * 3 / 4, height/ 2, width / 4, height / 2, 200);
		Thread.sleep(1000);
//点击“结束”进入页面
		driver.findElementById("com.myball.ctbcbank.uat:id/loading_button_start").click();
		Thread.sleep(3000);
//获取list第二学费缴纳，点击进入下个页面		
		List<WebElement> noteList = driver.findElementsById("com.myball.ctbcbank.uat:id/item_home_textview");
		WebElement node = noteList.get(1);
		String nodetitle = node.getAttribute("name");
		System.out.println("title is" + nodetitle);
		node.click();
		Thread.sleep(4000);
		
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}

