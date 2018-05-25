package liangyihui.app;

import org.testng.annotations.Test;

import liangyihui.test.Encap;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Patients extends Login {

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	public List<WebElement> getAlllabel() {
		java.util.List<WebElement> links = driver.findElements(
				By.cssSelector(".wx-app>div>div>div>.title-container>.item-left>.item-label"));
		return links;
	}
	
	public List<WebElement> getAllselect() {
		java.util.List<WebElement> links = driver.findElements(
				By.cssSelector(".wx-app>div>div>div>.title-container>.paper-title"));
		return links;
	}
	@Test
	public void login() throws MalformedURLException, InterruptedException{
		super.login();
		Thread.sleep(1000);
		
		List<WebElement> type = driver.findElementsById("net.liangyihui.app:id/iv_tab_icon");
		WebElement ent = type.get(3);
		ent.click();
		Thread.sleep(1000);
		List<WebElement> tab = driver.findElementsById("net.liangyihui.app:id/tv_tab_title");
		WebElement tv=tab.get(1);
		tv.click();
		Thread.sleep(1000);
		
		List<WebElement> list = driver.findElementsById("net.liangyihui.app:id/tv_name");
		WebElement ent1=list.get(1);
		ent1.click();
		Thread.sleep(1000);

		driver.findElementById("net.liangyihui.app:id/btn_create_new_diagnosis").click();
		Thread.sleep(1000);
		
	
		WebElement cancer= driver.findElementById("net.liangyihui.app:id/tv_cancer_type");
		String value= cancer.getAttribute("name");
		System.out.println("疾病诊断 ：" + value);
		Thread.sleep(1000);
		driver.findElementById("net.liangyihui.app:id/tv_action").click();
		Thread.sleep(3000);
		

		WebElement cancer1= driver.findElementById("net.liangyihui.app:id/tv_cancer_type");
		String name= cancer1.getAttribute("name");
		System.out.println("疾病诊断 ：" + name);
		Thread.sleep(1000);
		Assert.assertEquals(name, value);
		Thread.sleep(1000);
		System.out.println("添加成功");

		Encap tal = new Encap(driver);

		WebElement ti=tal.getAlltitle().get(1);
		ti.click();
		Thread.sleep(1000);
		
		
		Set<String> context = driver.getContextHandles();
		for (String contextName : context) {
			System.out.println(contextName);

		}
		driver.context("WEBVIEW");
		WebElement bot= driver.findElementByCssSelector(".btngroup2.fix-bottom>.btngroup2__btn.btn.btn-red");
		bot.click();		
		Thread.sleep(5000);
		
		driver.context("NATIVE_APP");		
		driver.findElementById("android:id/button2").click();
		Thread.sleep(5000);
		driver.context("WEBVIEW");
		
		
	
		WebElement paper= getAllselect().get(1);
		System.out.println(paper);

		paper.click();
		Thread.sleep(1000);

		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width /2,height*3/4, width/2, height/4, 200);
		Thread.sleep(1000);
		
		driver.findElementByName("下一步").click();
		Thread.sleep(5000);
		
		WebElement paper1= getAlllabel().get(0);
		paper1.click();
		
		driver.findElementByName("下一步").click();
		Thread.sleep(5000);
		
		driver.findElementByName("完成").click();
		





	}


}
