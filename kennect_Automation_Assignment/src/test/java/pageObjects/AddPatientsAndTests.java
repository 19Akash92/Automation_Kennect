package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import factory.BaseClass;;

public class AddPatientsAndTests extends BasePage {

	JavascriptExecutor jse;
	WebDriverWait wait;

	public AddPatientsAndTests(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//div[normalize-space()='Patients'])[1]")
	WebElement btnPatients;

	@FindBy(xpath = "(//span[contains(@class,'MuiButton-label jss')])[1]")
	WebElement btnAddPatient;

	@FindBy(xpath = "//input[@name='name']")
	WebElement inputPatientName;

	@FindBy(xpath = "//input[@name='email']")
	WebElement inputPatientEmail;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement inputPatientPhoneNo;

	@FindBy(xpath = "(//span[contains(@class,'MuiButton-label js')])[1]")
	WebElement btnGenerateDetails;

	@FindBy(xpath = "//input[@name='height']")
	WebElement inputHeight;

	@FindBy(xpath = "//input[@name='weight']")
	WebElement inputWeight;

	@FindBy(xpath = "//div[@id='mui-component-select-gender']")
	WebElement btnGender;

	@FindBy(xpath = "//li[normalize-space()='Male']")
	WebElement selectGender;

	@FindBy(xpath = "//input[@name='age']")
	WebElement inputAge;

	@FindBy(xpath = "//input[@name='systolic']")
	WebElement inputSystolic;

	@FindBy(xpath = "//input[@name='diastolic']")
	WebElement inputDiastolic;

	@FindBy(xpath = "//span[contains(@class,'MuiButton-label jss')]")
	WebElement btnAddTests;

	@FindBy(xpath = "//input[@id='patient-test']")
	WebElement clickAddTestForPatientListBox;

	@FindBy(xpath = "//div[normalize-space()='VITAMIN B12, SERUM']")
	WebElement selectVitaminB12Serun;

	@FindBy(xpath = "(//li[@id='patient-test-option-11'])[1]")
	WebElement selectTest1;

	@FindBy(xpath = "(//li[@id='patient-test-option-13'])[1]")
	WebElement selectTest2;

	@FindBy(xpath = "(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input' and @role='button'])[1]")
	WebElement clickDiscount;

	@FindBy(xpath = "(//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button'])[2]")
	WebElement selectDiscount;

	@FindBy(xpath = "(//div[@class='MuiAutocomplete-endAdornment'])[2]")
	WebElement clickLabSelection;


	@FindBy(xpath = "//div[contains(@class,'MuiBox-root jss')][normalize-space()='GENERAL DIAGNOSTICS - GD 1.1 Thyroid Profile, Iron Deficiency profile, Liver Profile, Lipid Profile, Kidney Profile - 400₹']")
	WebElement selectLabOption;

	@FindBy(xpath = "(//ul[@id='patient-tests-labs-popup'])/li[2]")
	WebElement selectLabOption2;
	
	@FindBy(xpath = "(//div[@class='MuiAutocomplete-endAdornment'])[3]")
	WebElement clickRecommendDoctor;

	@FindBy(xpath = "(//ul[contains(@id,'mui')])/li[2]")
	WebElement selectRecommendDoctor;

	@FindBy(xpath = "//button[@title='Add equipment']")
	WebElement btnAddEquipment;

	@FindBy(xpath = "//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline']")
	WebElement optionEquipmentName;

	@FindBy(xpath = "(//ul[@role='listbox'])/li[1][normalize-space()='injection']")
	WebElement selectEquipmentName1;

	@FindBy(xpath = "(//ul[@role='listbox'])/li[4]")
	WebElement selectEquipmentName2;

	@FindBy(xpath = "(//ul[@role='listbox'])/li[6]")
	WebElement selectEquipmentName3;

	@FindBy(xpath = "(//span[normalize-space()='check'])[2]")
	WebElement selectCheckOption;

	@FindBy(xpath = "//span[contains(@class,'MuiButton-label jss')]")
	WebElement btnClickAddPatient;

	public void clickPatientsFeature() {
		btnPatients.click();
	}

	public void clickAddPatient() {
		btnAddPatient.click();
	}

	public void enterPatientName() {
		inputPatientName.clear();
		inputPatientName.sendKeys("Paul Walker");
	}

	public void enterPatientEmail() {
		inputPatientEmail.clear();
		inputPatientEmail.sendKeys("PaulWalker@gmail.com");
	}

	public void enterPatientPhoneNo() {
		inputPatientPhoneNo.clear();
		inputPatientPhoneNo.sendKeys("9988776655");
	}

	public void clickGenerateDetails() {
		jse = (JavascriptExecutor) BaseClass.getDriver();
		jse.executeScript("arguments[0].scrollIntoView();", btnGenerateDetails);
		jse.executeScript("arguments[0].click()", btnGenerateDetails);
	}

	public void enterHeight() {

		inputHeight.clear();
		inputHeight.sendKeys("186");
	}

	public void enterWeight() {
		wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(inputWeight));
		inputWeight.clear();
		inputWeight.sendKeys("75");
	}

	public void selectGender() {
		btnGender.click();
		selectGender.click();
	}

	public void enterAge() {
		wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(inputAge));
		inputAge.clear();
		inputAge.sendKeys("35");
	}

	public void enterSystolic() {
		jse = (JavascriptExecutor) BaseClass.getDriver();
		jse.executeScript("arguments[0].scrollIntoView();", inputSystolic);
		inputSystolic.clear();
		inputSystolic.sendKeys("70");
	}

	public void enterDiastolic() {
		inputDiastolic.clear();
		inputDiastolic.sendKeys("80");
	}

	public void clickOnAddTests() {
		jse = (JavascriptExecutor) BaseClass.getDriver();
		jse.executeScript("arguments[0].scrollIntoView();", btnAddTests);
		btnAddTests.click();
	}

	public void clickAddTestForPatientListBox() {
		clickAddTestForPatientListBox.click();
	}

	public void selectVitaminB12SerunTest() {
		jse = (JavascriptExecutor) BaseClass.getDriver();
		jse.executeScript("arguments[0].scrollIntoView();", selectVitaminB12Serun);
		jse.executeScript("arguments[0].click()", selectVitaminB12Serun);

	}

	public void selectTest1() {
		jse = (JavascriptExecutor) BaseClass.getDriver();
		clickAddTestForPatientListBox.click();
		jse.executeScript("arguments[0].scrollIntoView();", selectTest1);
		jse.executeScript("arguments[0].click()", selectTest1);
	}

	public void selectTest2() {
		jse = (JavascriptExecutor) BaseClass.getDriver();
		clickAddTestForPatientListBox.click();
		wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(8));
		wait.until(ExpectedConditions.elementToBeClickable(selectTest2));
		jse.executeScript("arguments[0].scrollIntoView();", selectTest2);
		jse.executeScript("arguments[0].click()", selectTest2);
	}

	public void selectDiscount() {
		jse = (JavascriptExecutor) BaseClass.getDriver();
		jse.executeScript("arguments[0].scrollIntoView();", clickDiscount);
		jse.executeScript("arguments[0].click()", clickDiscount);
		clickDiscount.click();
		wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(8));
		wait.until(ExpectedConditions.elementToBeClickable(selectDiscount));
		selectDiscount.click();
	}

	public void selectLabOption() {
		wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(8));
		wait.until(ExpectedConditions.elementToBeClickable(clickLabSelection));
		jse = (JavascriptExecutor) BaseClass.getDriver();
		jse.executeScript("arguments[0].click()", clickLabSelection);
		clickLabSelection.click();

		wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(8));
		wait.until(ExpectedConditions.elementToBeClickable(selectLabOption));
		jse.executeScript("arguments[0].click()", selectLabOption);
		
		wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(8));
		wait.until(ExpectedConditions.elementToBeClickable(clickLabSelection));
		jse = (JavascriptExecutor) BaseClass.getDriver();
		jse.executeScript("arguments[0].click()", clickLabSelection);
		clickLabSelection.click();

		wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(8));
		wait.until(ExpectedConditions.elementToBeClickable(selectLabOption2));
		jse.executeScript("arguments[0].click()", selectLabOption2);
		
	}

	public void selectRecommandDoctor() {
		wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(8));
		wait.until(ExpectedConditions.elementToBeClickable(clickRecommendDoctor));
		jse = (JavascriptExecutor) BaseClass.getDriver();
		jse.executeScript("arguments[0].click()", clickRecommendDoctor);
		clickRecommendDoctor.click();
		jse.executeScript("arguments[0].click()", selectRecommendDoctor);

	}

	public void addEquipment() {
		jse = (JavascriptExecutor) BaseClass.getDriver();
		jse.executeScript("arguments[0].scrollIntoView();", btnAddEquipment);
		jse.executeScript("arguments[0].click()", btnAddEquipment);

		wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(10));
		jse = (JavascriptExecutor) BaseClass.getDriver();
		wait.until(ExpectedConditions.elementToBeClickable(optionEquipmentName));
		jse.executeScript("arguments[0].scrollIntoView();", optionEquipmentName);
		jse.executeScript("arguments[0].click()", optionEquipmentName);
		optionEquipmentName.click();

		wait.until(ExpectedConditions.elementToBeClickable(selectEquipmentName1));
		jse.executeScript("arguments[0].scrollIntoView();", selectEquipmentName1);
		jse.executeScript("arguments[0].click()", selectEquipmentName1);

		wait.until(ExpectedConditions.elementToBeClickable(selectCheckOption));
		jse.executeScript("arguments[0].scrollIntoView();", selectCheckOption);
		jse.executeScript("arguments[0].click()", selectCheckOption);

		jse = (JavascriptExecutor) BaseClass.getDriver();
		jse.executeScript("arguments[0].scrollIntoView();", btnAddEquipment);
		jse.executeScript("arguments[0].click()", btnAddEquipment);

		wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(8));
		jse = (JavascriptExecutor) BaseClass.getDriver();
		wait.until(ExpectedConditions.elementToBeClickable(optionEquipmentName));
		optionEquipmentName.click();

		wait.until(ExpectedConditions.elementToBeClickable(selectEquipmentName2));
		jse.executeScript("arguments[0].scrollIntoView();", selectEquipmentName2);
		jse.executeScript("arguments[0].click()", selectEquipmentName2);

		wait.until(ExpectedConditions.elementToBeClickable(selectCheckOption));
		jse.executeScript("arguments[0].scrollIntoView();", selectCheckOption);
		jse.executeScript("arguments[0].click()", selectCheckOption);

		jse = (JavascriptExecutor) BaseClass.getDriver();
		jse.executeScript("arguments[0].scrollIntoView();", btnAddEquipment);
		jse.executeScript("arguments[0].click()", btnAddEquipment);

		wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(8));
		jse = (JavascriptExecutor) BaseClass.getDriver();
		wait.until(ExpectedConditions.elementToBeClickable(optionEquipmentName));
		optionEquipmentName.click();

		wait.until(ExpectedConditions.elementToBeClickable(selectEquipmentName3));
		jse.executeScript("arguments[0].scrollIntoView();", selectEquipmentName3);
		jse.executeScript("arguments[0].click()", selectEquipmentName3);

		wait.until(ExpectedConditions.elementToBeClickable(selectCheckOption));
		jse.executeScript("arguments[0].scrollIntoView();", selectCheckOption);
		jse.executeScript("arguments[0].click()", selectCheckOption);

	}

	public void addPatient() {
		btnClickAddPatient.click();
	}

}
