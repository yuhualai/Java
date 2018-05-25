package liangyihui.net;

import org.testng.annotations.Test;

import liangyihui.list.ForEn;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Mine_certification extends Login {
	
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
		WebElement name = driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]"));
		
		String tra = name.getText();
		if (tra.equals("待审核")) {
			System.out.println("待审核状态");
		} else if (tra.equals("认证被拒")) {
			System.out.println("认证被拒");
			cation();
		} else if (tra.equals("已认证")) {
			System.out.println("已认证");
		} else {
			cation();
		}

	}

	public void cation() throws InterruptedException {
		ForEn lis = new ForEn(driver);
		driver.findElementByName("我的认证").click();
		Thread.sleep(1000);
		driver.findElementByName("重新认证").click();
		Thread.sleep(1000);
		driver.findElementByName("下一步").click();
		Thread.sleep(2000);

		WebElement Name = lis.getAllField().get(0);
		Name.sendKeys("于先生");
		Thread.sleep(1000);
		WebElement hospital = lis.getAllField().get(1);
		hospital.click();
		Thread.sleep(1000);
		WebElement hospitalname = lis.getAllField().get(0);
		hospitalname.clear();
		hospitalname.sendKeys("上海人民第一医院");
		Thread.sleep(1000);
		driver.findElementByName("没有我的选项，点击添加").click();
		Thread.sleep(2000);
		driver.findElementByName("下一步").click();
		Thread.sleep(2000);
		driver.findElementByName("完成").click();
		Thread.sleep(2000);

		System.out.println("提交成功");
	}


}