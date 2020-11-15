package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(id = "gender-male")
	WebElement genderRdoBtn;
	
	@FindBy(id = "FirstName")
	WebElement fnTxtBox;
	
	@FindBy(id = "LastName")
	WebElement LnTxtBox;
	
	@FindBy(id = "Email")
	WebElement emailTxtBox;
	
	@FindBy(id = "Password")
	WebElement passwordTxtBox;
	
	@FindBy(id = "ConfirmPassword")
	WebElement confirmPasswordTxtBox;
	
	@FindBy(id ="register-button")
	WebElement registerBtn;
	
	

	public void userRegistration (String FirstName, String LastName, String email, String password)
	{
		genderRdoBtn.click();
		fnTxtBox.sendKeys(FirstName);
		LnTxtBox.sendKeys(LastName);
		emailTxtBox.sendKeys(email);
		passwordTxtBox.sendKeys(password);
		confirmPasswordTxtBox.sendKeys(password);
		registerBtn.click();
		
	}
	
}
