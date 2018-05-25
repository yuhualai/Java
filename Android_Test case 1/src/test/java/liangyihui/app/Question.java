package liangyihui.app;

import org.testng.annotations.Test;

import liangyihui.test.Encap;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import org.testng.annotations.AfterClass;

public class Question extends Login {

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		super.beforeClass();

	}

	@Test
     public void login() throws MalformedURLException, InterruptedException {
	   super.login();
	   Thread.sleep(1000);

	   Encap tal = new Encap(driver);
	   tal.getAlltab().get(2).click();
	   Thread.sleep(1000);


    }

	@AfterClass
	public void afterClass() {
		super.afterClass();
	}


}
