package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	WebDriver driver;
	By username=By.id("user_email");
	By password=By.id("user_password");
	By login=By.xpath("//input[@type='submit']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getusername()
	{
		return driver.findElement(username);
	
	}

    public WebElement getpassword()
    {
	return driver.findElement(password);

     }
    
    public WebElement getlog()
    {
	return driver.findElement(login);

     }
}
