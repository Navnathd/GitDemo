package Academy.E2Eprojects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObject.LandingPage;
import pageObject.LoginPage;

import resources.Base;

public class HomePage extends Base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		
	}
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String password,String text) throws IOException
	{
		driver.get(prop.getProperty("url"));
		//to access the class 1)Inhetitate
		//2)creating object of that class invok the method
		LandingPage lp=new LandingPage(driver);
		
		lp.getLogin().click();
		
		
		
		LoginPage l=new LoginPage(driver);
		l.getusername().sendKeys(username);
		l.getpassword().sendKeys(password);
		log.info(text);
		l.getlog().click();
	}

	@DataProvider
	public Object[][] getData()
	{
		//0th row
		Object[][] data=new Object[2][3];
		data[0][0]="nikhil@abc.com";
		data[0][1]="nabc123";
		data[0][2]="nikhil";
		
		data[1][0]="nikhild@abc.com";
		data[1][1]="nabc1234";
		data[1][2]="nikhildevikar";
		
		return data;
		
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
