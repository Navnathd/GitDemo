package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePage {

	
	WebDriver driver;
	By search=By.name("qeury");
	
	
	public PortalHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getSearch()
	{
		return driver.findElement(search);
	}
}
