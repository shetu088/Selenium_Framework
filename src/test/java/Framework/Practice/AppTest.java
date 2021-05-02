package Framework.Practice;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.testbase;

public class AppTest extends testbase
{  
    @Test 
	public void Test1()
	{
		
		HomePage homepage = new HomePage();
		PageFactory.initElements(driver,homepage);
		Assert.assertTrue(homepage.verifycreatenewbtn());
		homepage.clickoncreatebtn();
		
	}
   
    @Test
    public void Test2()
    {
    	CreatePage createpage = new CreatePage();
    	PageFactory.initElements(driver,createpage);
    	createpage.enterdata();
    	Assert.assertTrue(createpage.btndisplayed());
    }
}
