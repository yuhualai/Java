package liangyihui.test;

import java.util.List;
import org.openqa.selenium.WebElement;

public interface IPinter {
	
	public void Having() throws InterruptedException;

	public void login() throws InterruptedException;

	public void guiding() throws InterruptedException;

	public void guiding2() throws InterruptedException;

	public List<WebElement> getAlltab();

	public List<WebElement> getAlltitle();

	public List<WebElement> getAlltv_tab_title();

	public List<WebElement> getAllinsert();

	public List<WebElement> getAllname();

}
