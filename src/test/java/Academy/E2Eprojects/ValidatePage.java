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

public class ValidatePage extends Base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigate to Home page");
	}
	@Test
	public void basePageNavigation() throws IOException
	{
	    
		//to access the class 1)Inhetitate
		//2)creating object of that class invok the method
		LandingPage ln=new LandingPage(driver);
		
		Assert.assertEquals(ln.getTitle().getText(),"FEATURED COURSES");
		log.info("successfully validate text message");
		
		
	}

	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
