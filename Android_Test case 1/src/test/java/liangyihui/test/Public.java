package liangyihui.test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class Public {
	public AndroidDriver<WebElement> driver;

	@BeforeClass
	public void beforeClass() throws MalformedURLException,RuntimeException {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "1fea68300904");
		cap.setCapability("platformVersion", "7.1.2");
		cap.setCapability("appPackage", "net.liangyihui.app");//包名
		cap.setCapability("appActivity", "com.dop.h_doctor.ui.splash.IntroActivity");//Activity名字

		cap.setCapability("automationName", "Appium");//默认使用uiautomator
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", "/Users/yuhualai/Desktop/net.liangyihui.app.apk");//apk地址
		cap.setCapability("unicodeKeyboard", true);  //是否需要输入非英文之外的语言并在测试完成后终止输入法
		cap.setCapability("reseKeyboard", true);

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
