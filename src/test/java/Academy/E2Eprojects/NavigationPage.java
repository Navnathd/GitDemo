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

public class NavigationPage extends Base {
	//Add logs
	//generating html reports
	//screenshots on failure
	//jenkins Integration
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void basePageNavigation() throws IOException
	{
	    
		//to access the class 1)Inhetitate
		//2)creating object of that class invok the method
		LandingPage ln=new LandingPage(driver);
		
		Assert.assertTrue(ln.getNavigationBar().isDisplayed());
		log.info("Navigation bar is displayed");
		
		}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
