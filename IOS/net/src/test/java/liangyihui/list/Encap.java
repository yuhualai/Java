package liangyihui.list;


import io.appium.java_client.ios.IOSDriver;

import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class Encap {
	public IOSDriver<WebElement> driver;
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// capabilities.setCapability("noReset", true);
		capabilities.setCapability("deviceName", "iPhone 6s");
		capabilities.setCapability("platformVersion", "10.0");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("appPackage", "net.liangyihui.app");
		capabilities.setCapability("app", "/Users/yuhualai/Desktop/oncologynews.app");
		capabilities.setCapability("appActivity", "com.dop.h_doctor.ui.splash.IntroActivity");

		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("unicodeKeyboard", true);
		capabilities.setCapability("reseKeyboard", true);

		driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	

}
