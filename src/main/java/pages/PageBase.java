package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

public class PageBase {

	
	public PageBase(WebDriver driver) {
		super();
	}

	public class pageBase
	{
		protected WebDriver driver;

		//Create Constructor
		public pageBase (WebDriver driver)
		{
			PageFactory.initElements(driver, this);


		}

	}
}
