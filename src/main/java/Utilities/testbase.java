package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class testbase {
	
	public WebDriver driver ;
	
	@BeforeTest
	public void Setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Practice\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.get("http://uitestpractice.com/Students/Index");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	    String s = driver.getCurrentUrl();
	    System.out.println(s);
	   
	}
	
	@AfterTest
	public void close()
	{
	//driver.quit();
	}

}
