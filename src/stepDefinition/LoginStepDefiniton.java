package stepDefinition;

import org.opencart.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefiniton {
	public  WebDriver driver;
	LoginPage loginpage;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Documents\\sonaliD\\selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
	}

	@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	@Given("^I am on opencart login page$")
	public void i_am_on_opencart_login_page() throws Throwable {
		
	    driver.get("https://www.opencart.com/index.php?route=account/login");
	    loginpage=new LoginPage(driver);
	    
	}

	@Given("^I have entered valid username and password$")
	public void i_have_entered_valid_username_and_password(String username, String password)  {
	    loginpage.enterEmail(username);
	    loginpage.enterPassword(password);
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	    loginpage.clickLoginButton();
	}

	@Then("^I should be login successfully$")
	public void i_should_be_login_successfully()  {
	    Assert.assertEquals(loginpage.checkLogoutLink(), true);
	}

	@Given("^I have enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_have_enter_invalid_and(String username, String password)  {
	loginpage.enterEmail(username);
	loginpage.enterPassword(password);
	}

	@When("^I click on the login button$")
	public void i_click_on_the_login_button()  {
	    loginpage.clickLoginButton();
	}

	@Then("^I should see an error message indicating \"([^\"]*)\"$")
	public void i_should_see_an_error_message_indicating(String arg1)  {
		Assert.assertEquals(driver.findElement(By.cssSelector(".alert-danger")).isDisplayed(),true);
		
	    
	}

	@When("^I click on \"([^\"]*)\" link$")
	public void i_click_on_link(String arg1)  {
	    
		loginpage.clickForogottonPasswordLink();
	}

	@Then("^I should be redirected to the password reset page$")
	public void i_should_be_redirected_to_the_password_reset_page() {
		
		Assert.assertTrue(loginpage.getForgotPwdPageUrl().contains("account/forgotten"));
	}

}

