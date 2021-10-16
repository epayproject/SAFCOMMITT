package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pages.CFUSIGNINPAGE;
import pages.CIAMHOMEPAGE;
import pages.PasswordPage;
import pages.SAFSIGNINPAGE;
import util.Base;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

@RunWith(Cucumber.class)
public class LoginSteps {
	
	public WebDriver driver;
	CIAMHOMEPAGE ch;
	CFUSIGNINPAGE cf;
	SAFSIGNINPAGE saf;
	PasswordPage pg;
	
	 @Given("^user is on B2C test harness page$")
	    public void user_is_on_b2c_test_harness_page() throws Throwable {
	       
		 driver=Base.getDriver();
	    }

	    @When("^user clicks on \"([^\"]*)\"$")
	    public void user_clicks_on_something(String strArg1) throws Throwable {
	     
	    	ch= new CIAMHOMEPAGE(driver);
	    	ch.getCiamTestLink().click();
	    	
	    }

	    @Then("^user should login successfully$")
	    public void user_should_login_successfully() throws Throwable {
	      
	    }

	    @And("^User clicks on sign in$")
	    public void user_clicks_on_sign_in() throws Throwable {
	    	
	    	cf= new CFUSIGNINPAGE(driver);
	    	cf.clickOnSignIn().click();
	     
	    }

	    @And("^user enters his username and clicks on signin$")
	    public void user_enters_his_username_and_clicks_on_signin() throws Throwable {
	     	saf= new SAFSIGNINPAGE(driver);
	    	saf.enterSignInName().sendKeys("RR1.test@example.com");
	    	saf.getSignInButton().click();
	    }

	    @And("^user enters his password and clicks on signin$")
	    public void user_enters_his_password_and_clicks_on_signin() throws Throwable {
	        pg= new PasswordPage(driver);
	        pg.enterPassword().sendKeys("Pass@4506");
	        pg.clickSignIn().click();
	    }

	    



}
