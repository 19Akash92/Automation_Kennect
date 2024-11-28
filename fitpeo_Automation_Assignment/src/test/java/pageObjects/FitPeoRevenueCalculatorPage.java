package pageObjects;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FitPeoRevenueCalculatorPage extends BasePage {

	public FitPeoRevenueCalculatorPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@data-index='0']")
	WebElement slider;

	@FindBy(className = "MuiInputBase-input")
	WebElement valueOfSliderInputBox;

	@FindBy(xpath = "//input[contains(@id,'r')]")
	WebElement textInputBox;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	WebElement selectCheckboxOf99091;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	WebElement selectCheckboxOf99453;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	WebElement selectCheckboxOf99454;

	@FindBy(xpath = "(//input[@type='checkbox'])[8]")
	WebElement selectCheckboxOf99474;

	@FindBy(xpath = "(//p[text()='110700'])[1]")
	WebElement texttotalRecurringReimbursement;

	public void setSliderValue() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", slider);
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, 93, 0).perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isValueOfSliderAndtextFiledMatching() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", slider);
		int inputBoxValue = Integer.parseInt(textInputBox.getAttribute("value"));
		int sliderValue = Integer.parseInt(slider.getAttribute("value"));
		if (inputBoxValue == sliderValue) {
			return true;
		} else {
			return false;
		}
	}

	public void enterValueInSliderTextField() {

		new WebDriverWait(driver, Duration.ofSeconds(15)).ignoring(StaleElementReferenceException.class)
				.until((WebDriver driver) -> {
					WebElement element = textInputBox;
					Actions act = new Actions(driver);
					
					JavascriptExecutor jse = (JavascriptExecutor) driver;
					jse.executeScript("arguments[0].scrollIntoView();", element);
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					act.moveToElement(element).click().keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL)
							.keyDown(Keys.BACK_SPACE).sendKeys("560").perform();
					return true;
				});
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectCheckBox() {
		selectCheckboxOf99091.click();
		selectCheckboxOf99453.click();
		selectCheckboxOf99454.click();
		selectCheckboxOf99474.click();

		new WebDriverWait(driver, Duration.ofSeconds(10)).ignoring(StaleElementReferenceException.class)
				.until((WebDriver driver) -> {
					WebElement element = textInputBox;
					Actions act = new Actions(driver);
					act.moveToElement(element).click().keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL)
							.keyDown(Keys.BACK_SPACE).sendKeys("820").perform();
					return true;
				});

	}

	public boolean validateTotalRecurringReimbursement() {
		String requiredTotalRecurringReimbursement = "$110700";
		String expectedTotalRecurringReimbursement = texttotalRecurringReimbursement.getText().trim();
		if (requiredTotalRecurringReimbursement.equalsIgnoreCase(expectedTotalRecurringReimbursement)) {
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;

		} else {
			return false;
		}
	}
	

}
