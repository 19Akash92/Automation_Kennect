package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FitPeoHomepage extends BasePage {

	public FitPeoHomepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//div[normalize-space()='Revenue Calculator'])[1]")
	WebElement linkRevCalculator;

	public void clickRevenueCalculator() {
		linkRevCalculator.click();

	}

}
