package Framework.Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import Utilities.testbase;

public class HomePage extends testbase {
	
	@FindBy(how = How.LINK_TEXT , using = "Create New")
	WebElement createbtn;
	
	
	public void clickoncreatebtn()
	{
		createbtn.click();
	}

	
	
	public Boolean verifycreatenewbtn()
	{
		return createbtn.isDisplayed();
	}
}
