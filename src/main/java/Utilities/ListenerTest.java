package Utilities;

import org.testng.ITestListener;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.ITestResult;

public class ListenerTest extends testbase implements ITestListener

{  
	
    
    @Override
	public void onTestFailure(ITestResult result)
	{   
    	System.out.println("inside on test failure method");
		screenshot np = new screenshot();
		try {
			try {
				np.getdata(driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
