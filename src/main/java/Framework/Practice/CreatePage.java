package Framework.Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import Utilities.testbase;

public class CreatePage extends testbase {
	
	@FindBy(how = How.ID , using ="FirstName")
	WebElement firstname;
	
	@FindBy(how = How.ID ,using ="LastName")
	WebElement lastname;
	
	@FindBy(how = How.ID , using ="EnrollmentDate")
	WebElement date;
	
	@FindBy(how = How.XPATH , using ="//input[@type ='submit']")
	WebElement create;
	
	
	public void enterdata()
	{
		firstname.sendKeys("Shreshtha");
		lastname.sendKeys("singhal");
		date.sendKeys("02/05/1998");
		create.click();
	}

	
	public Boolean btndisplayed()
	{
		return create.isEnabled();
	}
}
