package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase 
{

	HomePage homeObject;
	UserRegistrationPage registerObject;

	@Test
	public void UserCanRegisterSuccessuflly()
	{

		homeObject = new HomePage(driver);
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegistration("Aymen", "Guelmemi", "testtest1@gmail.com", "12345");

	}

}
	