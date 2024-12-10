package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.AddPatientsAndTests;

public class AddingPatientsAndCreatingTestsSteps {

	AddPatientsAndTests addPatientAndTest;

	@Then("User clicks on Patients feature which is available on GOR Pathology and Diagnostic Home Page")
	public void user_clicks_on_patients_feature_which_is_available_on_gor_pathology_and_diagnostic_home_page() {
		BaseClass.getLogger().info("Clicks on Patients feature");
		addPatientAndTest = new AddPatientsAndTests(BaseClass.getDriver());
		addPatientAndTest.clickPatientsFeature();
	}

	@Then("User cliks on Add Patient button")
	public void user_cliks_on_add_patient_button() {
		BaseClass.getLogger().info("Clicks on Add Patient button");
		addPatientAndTest.clickAddPatient();

	}

	@Then("User add Patient Contact Details and clicks on GENERAL DETAILS button")
	public void user_add_patient_contact_details_and_clicks_on_general_details_button() {
		BaseClass.getLogger().info("User Enters contact details of patient");
		addPatientAndTest.enterPatientName();
		addPatientAndTest.enterPatientEmail();
		addPatientAndTest.enterPatientPhoneNo();
		addPatientAndTest.clickGenerateDetails();
	}

	@Then("User adds Secondary details of TestData and Blood Pressure")
	public void user_adds_secondary_details_of_test_data_and_blood_pressure() {
		BaseClass.getLogger().info("User Enters Secondary details of patient");
		addPatientAndTest.enterHeight();
		addPatientAndTest.enterWeight();
		addPatientAndTest.selectGender();
		addPatientAndTest.enterAge();
		addPatientAndTest.enterSystolic();
		addPatientAndTest.enterDiastolic();

	}

	@Then("User clicks on ADD TESTS button")
	public void user_clicks_on_add_tests_button() {
		addPatientAndTest.clickOnAddTests();
	}

	@Then("User fills the details in Test Cost Calculator and clicks on ADD PATIENT button")
	public void user_fills_the_details_in_test_cost_calculator_and_clicks_on_add_patient_button() {
		BaseClass.getLogger().info("User selects options from Test Cost Calculator");
		addPatientAndTest.clickAddTestForPatientListBox();
		addPatientAndTest.selectVitaminB12SerunTest();
		addPatientAndTest.selectTest1();
		addPatientAndTest.selectTest2();
		addPatientAndTest.selectDiscount();
		addPatientAndTest.selectLabOption();
		addPatientAndTest.selectRecommandDoctor();
		addPatientAndTest.addEquipment();
		addPatientAndTest.addPatient();
	}

}
