package liangyihui.list;

import io.appium.java_client.ios.IOSDriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ForEn implements IPTest {
    public IOSDriver<WebElement> driver;
	public ForEn(IOSDriver<WebElement> driver) {
		this.driver = driver;
	}


	@Override
	/**
	 * 点击"随便看看"
	 ***/
	public void Having() throws InterruptedException {
		// TODO Auto-generated method stub
//		driver.findElement(By
//				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[4]"))
//				.click();
		driver.findElementByXPath("//*[@name='随便看看>>']").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath(
				"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]")
				.click();

		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[7]"))
				.click();
		Thread.sleep(2000);

	}

	@Override
	/**
	 * 登录
	 **/
	public void login() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement name = getAllField().get(0);
		name.sendKeys("14700000001");
		Thread.sleep(1000);

		WebElement passw = getAllSecure().get(0);
		passw.sendKeys("123456");
		Thread.sleep(1000);

		driver.findElementByName("登 录").click();
		Thread.sleep(1000);
	}

	@Override
	/**
	 * 文章详情引导
	 **/
	public void guiding() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[3]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[3]"))
				.click();
		Thread.sleep(1000);

	}

	@Override
	/**
	 * 患者详情引导
	 **/
	public void guiding2() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]"))
				.click();
		Thread.sleep(1000);

	}

	@Override
	public List<WebElement> getAllText() {
		// TODO Auto-generated method stub
		List<WebElement> lis = driver.findElementsByClassName("XCUIElementTypeStaticText");
		return lis;
	}

	@Override
	public List<WebElement> getAllField() {
		// TODO Auto-generated method stub
		List<WebElement> lis = driver.findElementsByClassName("XCUIElementTypeTextField");
		return lis;
	}

	@Override
	public List<WebElement> getAllSecure() {
		// TODO Auto-generated method stub
		List<WebElement> lis = driver.findElementsByClassName("XCUIElementTypeSecureTextField");
		return lis;
	}

	@Override
	public List<WebElement> getAllButton() {
		// TODO Auto-generated method stub
		List<WebElement> lis = driver.findElementsByClassName("XCUIElementTypeButton");
		return lis;
	}

	@Override
	public List<WebElement> getAllCell() {
		// TODO Auto-generated method stub
		List<WebElement> lis = driver.findElementsByClassName("XCUIElementTypeCell");
		return lis;
	}

	@Override
	public List<WebElement> getAllOther() {
		// TODO Auto-generated method stub
		List<WebElement> lis = driver.findElementsByClassName("XCUIElementTypeOther");
		return lis;
	}

}
