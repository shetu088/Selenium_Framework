package Framework.Practice;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.testbase;


public class Finalform extends testbase {
	
	
		
	@Test
    public void submitform() throws IOException
    {
		Formsubmit form = new Formsubmit();
		PageFactory.initElements(driver, form);
		form.clickonform();
		form.writedata();
				
    }
	
	
}
