package liangyihui.web;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.liangyihui.net.SelectDriver;


public class TestLogin {
	public WebDriver driver;
	public TestLogin(String browser){
		SelectDriver SelectDriver = new SelectDriver();
		this.driver = SelectDriver.driverName(browser);
	}

	public void loginScript() throws InterruptedException {
		 
		 driver.get("http://www.liangyihui.net/");
		 driver.manage().window().maximize();
		 
		 String loginElement = "login";
		 String uesrnanme="18900000009";
		 String mobileElement = "login1_mobile";
		 String userpass="123456";
		 String passwordElement = "password";
		 String IdBy = "id";
		 String NameBy = "name";
		 
		
		element(byStr(IdBy, loginElement)).click();
		Thread.sleep(2000);


		/**
		 * 登录页面输入手机号
		 ***/
		WebElement user = element(byStr(IdBy, mobileElement));
		Assert.assertTrue(user.isDisplayed());
		user.sendKeys(uesrnanme);
		String value = user.getAttribute("value");
		System.out.println("输入手机号：" + value);
		Thread.sleep(1000);
		// JavascriptExecutor js = (JavascriptExecutor) driver;

		/**
		 * 登录页面输入密码
		 ***/
		WebElement passwor = element(byStr(NameBy, passwordElement));
		Assert.assertTrue(passwor.isDisplayed());
		passwor.sendKeys(userpass);
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
			takeScreenShot();
		} else {
			System.out.println("登录失败");
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
	public By byStr(String by, String local) {
		if (by.equals("id")) {
			return By.id(local);
		} else if (by.equals("tagName")) {
			return By.tagName(local);
		} else if (by.equals("name")) {
			return By.name(local);
		} else if (by.equals("className")) {
			return By.className(local);
		} else {
			return By.xpath(local);
		}
	}

	/**
	 * 封装Element
	 */
	public  WebElement element(By by) {
		WebElement ele = driver.findElement(by);
		return ele;
	}

	/**
	 * 截图
	 **/
	public  void takeScreenShot() {
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

	public void wess() {
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
		TestLogin test = new TestLogin("chrome");
//		test.loginScript();	
		test.wess();
		}
	   
	
	}



