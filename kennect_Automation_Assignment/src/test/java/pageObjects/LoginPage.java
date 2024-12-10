package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='email']")
	WebElement txtEmailAddress;

	@FindBy(xpath = "//input[@name='password']")
	WebElement txtPassword;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained jss11 MuiButton-containedPrimary MuiButton-containedSizeLarge MuiButton-sizeLarge']")
	WebElement btnLogin;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit' and @aria-label='account of current user']")
	WebElement btnAccountOfCurrentUser;

	@FindBy(xpath = "//div[normalize-space()='test@kennect.io']")
	WebElement getTextOfAccountOfCurrentUser;
	
	
	public void setEmail(String Username) {
		txtEmailAddress.sendKeys(Username);
	}

	public void setPassword(String Password) {
		txtPassword.sendKeys(Password);
	}

	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickOnCurrentUserButton() {
		WebDriverWait wait=new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(8));
		wait.until(ExpectedConditions.visibilityOf(btnAccountOfCurrentUser));
		btnAccountOfCurrentUser.click();
	}
	
	public String getTextOfCurrentLoggedInUser() {
		WebDriverWait wait=new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(8));
		wait.until(ExpectedConditions.visibilityOf(getTextOfAccountOfCurrentUser));
		String currentUser=getTextOfAccountOfCurrentUser.getText();
		return currentUser;
	}
		
}
