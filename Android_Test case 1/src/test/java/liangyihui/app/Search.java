package liangyihui.app;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import liangyihui.test.Encap;
import liangyihui.test.Public;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class Search extends Public{
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "25243556");
		cap.setCapability("platformVersion", "4.4");
		cap.setCapability("appPackage", "net.liangyihui.app");
		cap.setCapability("appActivity", "com.dop.h_doctor.ui.splash.IntroActivity");

		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", "/Users/yuhualai/Desktop/net.liangyihui.app.apk");
		cap.setCapability("unicodeKeyboard", true);
		cap.setCapability("reseKeyboard", true);

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void search() throws InterruptedException {
		Encap tal = new Encap(driver);
		tal.Having();
		Thread.sleep(3000);
		// driver.findElementById("net.liangyihui.app:id/im_show").click();
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		//
		// for (int i = 0; i < 4; i++) {
		// driver.swipe(width*4/5,height/2,width/5,height/2,200);
		// Thread.sleep(1000);
		// }
		// Thread.sleep(5000);
		driver.findElementById("net.liangyihui.app:id/im_search").click();
		Thread.sleep(1000);
		driver.findElementById("net.liangyihui.app:id/et_search").sendKeys("乳腺癌");
		Thread.sleep(2000);
		driver.findElementById("net.liangyihui.app:id/tv_check").click();
		Thread.sleep(3000);

		List<WebElement> noteList = driver.findElementsById("net.liangyihui.app:id/tv_title");
		WebElement node = noteList.get(0);
		String nodetitle = node.getAttribute("name");
		System.out.println("title is" + nodetitle);
		node.click();
		Thread.sleep(5000);
		Set<String> context = driver.getContextHandles();
		for (String contextName : context) {
			System.out.println(contextName);

		}
		driver.context("WEBVIEW");
		WebElement title = driver.findElement(By.className("title"));
		System.out.println(title);
		System.out.println(title.getText());
		Thread.sleep(1000);
		driver.context("NATIVE_APP");
		driver.findElementByClassName("android.widget.ImageButton").click();
		Thread.sleep(1000);
		driver.findElementByClassName("android.widget.ImageButton").click();
		Thread.sleep(1000);
		for (int i = 0; i < 5; i++) {
			driver.swipe(width / 2, height * 2 / 3, width / 2, height / 3, 200);
			Thread.sleep(1000);
		}
		Thread.sleep(5000);
	}

}
