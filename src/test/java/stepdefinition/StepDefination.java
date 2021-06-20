package stepdefinition;


	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.PortalHomePage;
import resources.Base;

import org.junit.Assert;
import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	public class StepDefination extends Base{

		@Given("^Initialize browser with chrome$")
		public void initialize_browser_with_chrome() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver = initializeDriver();
		}

		@Given("^navigate to \"([^\"]*)\" site$")
		public void navigate_to_site(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.get(arg1);
		}

		@Given("^click on login link in a home page to land on secure login page$")
		public void click_on_login_link_in_a_home_page_to_land_on_secure_login_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			LandingPage lp=new LandingPage(driver);
			if(lp.getPopupSize()>0)
			{
				lp.getPopup().click();;
			}
			lp.getLogin().click();
		}

		 @When("^Enter valid (.+) and (.+)$")
		    public void enter_valid_and(String username, String password) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			LoginPage l=new LoginPage(driver);
			l.getusername().sendKeys(username);
			l.getpassword().sendKeys(password);
			
			l.getlog().click();
		    
		}

		@Then("^verify that user is successfully login$")
		public void verify_that_user_is_successfully_login() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			PortalHomePage ph=new PortalHomePage(driver);
			Assert.assertTrue(ph.getSearch().isDisplayed());
		    
		}
		
		@And("^close browsers$")
	    public void close_browsers() throws Throwable {
	       driver.quit();
	    }

		
		




	}

	
