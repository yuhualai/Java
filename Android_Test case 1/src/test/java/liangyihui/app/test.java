package liangyihui.app;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import liangyihui.test.Encap;
import liangyihui.test.Public;

public class test extends Public{
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}

	@Test
	// 判断文章类型是普通文章
	public void f() throws InterruptedException, MalformedURLException {
		Encap tal = new Encap(driver);
		tal.Having();
		Thread.sleep(6000);
		
		List<WebElement> lis =  getElementsByClassAndIndexAndClickable("android.widget.TextView",1);
		WebElement gElement = lis.get(2);
		String name = gElement.getAttribute("name");
		System.out.println(name);
//		List<WebElement> textFieldsList = driver.findElementsByClassName("android.widget.TextView");
//        for(int i=0;i<textFieldsList.size();i++)   {
//              if(textFieldsList.get(i).getText().equals("知识")){
//            	  System.out.println("知识");
//                  textFieldsList.get(i).click();
//              }    
//        }
	  
	}
	public List<WebElement> getElementsByClassAndIndexAndClickable(String classname,int index){
		List<WebElement> lis =null;
		lis = driver.findElementsByAndroidUIAutomator("new UiSelector().className("+classname+").index("+index+")");
		return lis;
		}
	

}
