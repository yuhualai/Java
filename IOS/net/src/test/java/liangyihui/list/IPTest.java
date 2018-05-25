package liangyihui.list;

import java.util.List;

import org.openqa.selenium.WebElement;

public abstract interface IPTest {

	public void Having() throws InterruptedException;

	public void login() throws InterruptedException;

	public void guiding() throws InterruptedException;

	public void guiding2() throws InterruptedException;

	public List<WebElement> getAllText();

	public List<WebElement> getAllField();

	public List<WebElement> getAllSecure();

	public List<WebElement> getAllButton();

	public List<WebElement> getAllCell();

	public List<WebElement> getAllOther();

}
