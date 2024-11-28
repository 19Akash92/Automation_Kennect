package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FitPeoHomepage;
import pageObjects.FitPeoRevenueCalculatorPage;

public class RevenueCalculatorSteps {

	WebDriver driver;
	FitPeoHomepage homePage;
	FitPeoRevenueCalculatorPage rcp;

	@Given("user navigates to FitPeo Home Page")
	public void user_navigates_to_fit_peo_home_page() {
		homePage = new FitPeoHomepage(BaseClass.getDriver());
	}

	@Then("user clicks on FitPeo Revenue Calculator which will redirect user to FitPeo Revenue Calculator Page")
	public void user_clicks_on_fit_peo_revenue_calculator_which_will_redirect_user_to_fit_peo_revenue_calculator_page() {
		homePage = new FitPeoHomepage(BaseClass.getDriver());
		homePage.clickRevenueCalculator();
	}

	@Given("user is on FitPeo Revenue Calculator Page")
	public void user_is_on_fit_peo_revenue_calculator_page() {
		homePage = new FitPeoHomepage(BaseClass.getDriver());
		homePage.clickRevenueCalculator();
	}

	@Then("user Scroll down the page until the revenue calculator slider is visible and set its value to {int}")
	public void user_scroll_down_the_page_until_the_revenue_calculator_slider_is_visible_and_set_its_value_to(
			Integer int1) {
		rcp = new FitPeoRevenueCalculatorPage(BaseClass.getDriver());
		rcp.setSliderValue();
	}

	@Then("user verify bottom text field of slider shows value as {int}")
	public void user_verify_bottom_text_field_of_slider_shows_value_as(Integer int1) {
		rcp = new FitPeoRevenueCalculatorPage(BaseClass.getDriver());
		boolean valueMatching = rcp.isValueOfSliderAndtextFiledMatching();
		Assert.assertEquals(valueMatching, true);
	}

	@When("user clicks on the text field associated with the slider and enter the value {int}")
	public void user_clicks_on_the_text_field_associated_with_the_slider_and_enter_the_value(Integer int1) {
		rcp = new FitPeoRevenueCalculatorPage(BaseClass.getDriver());
		rcp.enterValueInSliderTextField();
	}

	@Then("user validate slider positioned updated to {int}")
	public void user_validate_slider_positioned_updated_to(Integer int1) {
		rcp = new FitPeoRevenueCalculatorPage(BaseClass.getDriver());
		boolean valueMatching = rcp.isValueOfSliderAndtextFiledMatching();
		Assert.assertTrue(valueMatching);
	}

	@When("user select the check-boxes for CPT-{int}, CPT-{int}, CPT-{int} and CPT-{int}")
	public void user_select_the_check_boxes_for_cpt_cpt_cpt_and_cpt(Integer int1, Integer int2, Integer int3,
			Integer int4) {
		rcp = new FitPeoRevenueCalculatorPage(BaseClass.getDriver());
		rcp.selectCheckBox();

	}

	@Then("user validate that header displaying Total Recurring Reimbursement for all Patients Per Month shows the value ${int}")
	public void user_validate_that_header_displaying_total_recurring_reimbursement_for_all_patients_per_month_shows_the_value_$(
			Integer int1) {

		rcp = new FitPeoRevenueCalculatorPage(BaseClass.getDriver());
		boolean validateTotalRecurringReimbursement = rcp.validateTotalRecurringReimbursement();
		Assert.assertTrue(validateTotalRecurringReimbursement);

	}

}
