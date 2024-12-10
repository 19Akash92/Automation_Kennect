package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddPatientsAndTests;
import pageObjects.LoginPage;

public class LoginSteps {
	
	LoginPage lp;
	
	@Given("the user navigates to login page")
	public void user_navigate_to_login_page() {

		BaseClass.getLogger().info("Goto GOR Pathology & Diagnostic login page");
		lp = new LoginPage(BaseClass.getDriver());
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String Username, String Password) {
		BaseClass.getLogger().info("Entering Username and Password.. ");
		lp.setEmail(Username);
		lp.setPassword(Password);
	}

	@When("the user clicks on the Login button")
	public void click_on_login_button(){
		BaseClass.getLogger().info("User clicks on Login Button");
		lp.clickLogin();
		BaseClass.getLogger().info("clicked on login button...");
	}

	@Then("the user should be redirected to the GOR Pathology and Diagnostic Home Page")
	public void user_navigates_to_GOR_Pathology_and_Diagnostic_Home_page() {
		BaseClass.getLogger().info("User is on GOR Pathology and Diagnostic Home Page");
		lp.clickOnCurrentUserButton();
		String expectedLoggedInUser = "test@kennect.io";
		boolean isCurrentLoggedInUserMatched = lp.getTextOfCurrentLoggedInUser().equalsIgnoreCase(expectedLoggedInUser);
		Assert.assertEquals(isCurrentLoggedInUserMatched, true);

	}
	
}
