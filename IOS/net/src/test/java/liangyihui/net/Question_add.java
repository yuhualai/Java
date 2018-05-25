package liangyihui.net;

import org.testng.annotations.Test;

import liangyihui.list.Encap;
import liangyihui.list.ForEn;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class Question_add extends Encap {

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void question() throws InterruptedException {

		ForEn lis = new ForEn(driver);
		lis.Having();

		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTabBar[1]/"
						+ "XCUIElementTypeOther[2]/XCUIElementTypeButton[3]"))
				.click();
		Thread.sleep(1000);

		lis.login();
		Thread.sleep(1000);

		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTabBar[1]/"
						+ "XCUIElementTypeOther[2]/XCUIElementTypeButton[3]"))
				.click();
		Thread.sleep(1000);

		lis.guiding2();

		driver.findElement(By
				.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
						+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.className("XCUIElementTypeTextView")).sendKeys("Ra 癌症");
		Thread.sleep(1000);
		driver.findElement(By.name("肺癌")).click();
		driver.findElement(By.name("胃癌")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("下一步")).click();
		Thread.sleep(1000);
		// driver.findElement(By.name("添加文章")).click();
		// Thread.sleep(1000);
		// driver.findElement(By.className("XCUIElementTypeOther")).sendKeys("胃癌");
		// driver.findElement(By.name("Search")).click();
		// Thread.sleep(1000);
		// driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
		// +
		// "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")).click();
		// Thread.sleep(1000);
		driver.findElement(By.className("XCUIElementTypeTextView")).sendKeys("癌症");
		driver.findElement(By.name("发布")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("问题")).click();

		System.out.println("发布成功");

		// int width = driver.manage().window().getSize().width;
		// int height = driver.manage().window().getSize().height;
		// driver.swipe(width / 2, height /4, width / 2, height*3/4, 200);
		// WebElement Namework = driver.findElementByName("Ra 癌症");
		// Assert.assertTrue(Namework.isDisplayed());
		// String value = Namework.getAttribute("name");
		// if (value.equals("Ra 癌症")) {
		// System.out.println("发布成功");
		// } else {
		// System.out.println("发布失败");
		// }

	}

}