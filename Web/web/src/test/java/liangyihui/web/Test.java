package liangyihui.web;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import com.liangyihui.util.ProUtil;

public class Test {
	public static  WebDriver driver;

	public static  void InitDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/yuhualai/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.liangyihui.net/");
		driver.manage().window().maximize();

	}

	public static void loginScript(String username, String password) throws InterruptedException {
		InitDriver();
		// String loginElement = "login";
		// String uesrnanme="18900000009";
		// String mobileElement = "login1_mobile";
		// String userpass="123456";
		// String passwordElement = "password";
		// String IdBy = "id";
		// String NameBy = "name";
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();
		// WebElement inputBox=driver.findElement(By.id(loginElement));
		// WebElement inputBox=element(byStr("login"));
		// inputBox.isDisplayed();
		// inputBox.click();
		// Thread.sleep(2000);

		/**
		 * 登录页面输入手机号
		 ***/
		WebElement user = element(byStr("username"));
		user.isDisplayed();
		user.sendKeys(username);
		String value = user.getAttribute("value");
		System.out.println("输入手机号：" + value);
		Thread.sleep(1000);
		// JavascriptExecutor js = (JavascriptExecutor) driver;

		/**
		 * 登录页面输入密码
		 ***/
		WebElement passwor = element(byStr("userpass"));
		passwor.isDisplayed();
		passwor.sendKeys(password);
		String value1 = passwor.getAttribute("value");
		System.out.println("输入密码：" + value1);
		Thread.sleep(1000);

		/**
		 * 点击登录，获取文本值
		 ***/
		WebElement login = driver.findElement(By.xpath("html/body/div[10]/div[3]/form[1]/div[4]/button"));
		Assert.assertTrue(login.isDisplayed());
		login.click();
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.cssSelector(".header_nickname>.header_nickname_text.dotdotdot"));
		String name = element.getText();
		if (name.equals("肿瘤_Test")) {
			System.out.println("登录成功");
//			takeScreenShot();
		} else {
			System.out.println("登录失败");
			takeScreenShot();
		}

		/**
		 * 移动到名称位置
		 */
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		Thread.sleep(5000);
		driver.close();

	}

	/**
	 * 封装By by
	 */
	public static By byStr(String username) {
		ProUtil properties = new ProUtil("element.properties");
		String locator = properties.getPro(username);
		String locatorType = locator.split(">")[0];
		String locatorValue = locator.split(">")[1];
		if (locatorType.equals("id")) {
			return By.id(locatorValue);
		} else if (locatorType.equals("tagName")) {
			return By.tagName(locatorValue);
		} else if (locatorType.equals("name")) {
			return By.name(locatorValue);
		} else if (locatorType.equals("className")) {
			return By.className(locatorValue);
		} else {
			return By.xpath(locatorValue);
		}
	}

	/**
	 * 封装Element
	 */
	public static WebElement element(By by) {
		WebElement ele = driver.findElement(by);
		return ele;
	}

	/**
	 * 截图
	 **/
	public static void takeScreenShot() {
		long data = System.currentTimeMillis();
		String path = String.valueOf(data);
		String curPath = System.getProperty("user.dir");
		path = path + ".png";
		String screenPaht = curPath + "/" + path;
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File(screenPaht));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void wess() {
		driver.get("http://www.liangyihui.net/account/profile");
		/**
		 * 转换成js
		 */
		String jsString = "docoument.getElementsByclassName('name')[0].style.bottom='0';";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(jsString);

		/**
		 * 移动到某个位置
		 */
		WebElement passw = driver.findElement(By.name("hah"));
		Actions actions = new Actions(driver);
		actions.moveToElement(passw).perform();

	}

	public static void main(String[] args) throws InterruptedException {
		/**
		 * 登入参数化
		 ***/
		HashMap<String, String> user = new HashMap<String, String>();
		user.put("18689630926", "111111");
		user.put("18900000009", "123456");
		user.put("18900000008", "123456");

		Iterator us = user.entrySet().iterator();
		while (us.hasNext()) {
			Map.Entry entry = (Map.Entry) us.next();
			String username = entry.getKey().toString();
			String password = entry.getValue().toString();
//			System.out.println(username+password);
			loginScript(username, password);
		}
		driver.quit();
	}

}
