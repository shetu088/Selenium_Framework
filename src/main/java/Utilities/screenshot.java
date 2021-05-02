package Utilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utilities.testbase;

public class screenshot extends testbase {
	
	public void getdata(WebDriver driver) throws IOException
	{
		System.out.println("starting get data method");
		String path = "‪D:\\Eclipse\\Practice\\screens\\shetu.png" ;
		TakesScreenshot src = ((TakesScreenshot)driver);
		System.out.println("in between getdata method");
		File SrcFile=src.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(path);
		 FileUtils.copyFile(SrcFile, DestFile);
		 
	}

}
