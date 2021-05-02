package Framework.Practice;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import Utilities.Excel;
import Utilities.testbase;




public class Formsubmit extends testbase  {
	
	
	@FindBy(how = How.LINK_TEXT  , using ="Form")
	WebElement click;
    
	
	@FindBy(how = How.ID , using ="firstname")
	WebElement name;
	
	@FindBy(how = How.ID , using = "lastname")
	WebElement lastname;
	
	@FindBy(how = How.XPATH , using ="/html/body/div[2]/div[1]/div/form/div[3]/label[3]/input")
	WebElement martialstatus;
	
	@FindBy(how = How.XPATH , using ="/html/body/div[2]/div[1]/div/form/div[4]/label[2]/input")
	WebElement hobby;
	
	@FindBy(how = How.ID , using = "sel1")
	WebElement country;
	
	@FindBy(how = How.ID , using ="datepicker")
	WebElement dateofbirth;
	
	@FindBy(how = How.ID , using ="phonenumber")
	WebElement phoneno;
	
	
	@FindBy(how = How.ID , using ="username")
	WebElement username;

	@FindBy(how = How.ID , using ="email")
	WebElement email;
	
	
	@FindBy(how = How.ID , using = "comment")
	WebElement aboutyourself;
	
	@FindBy(how = How.ID , using = "pwd")
	WebElement password;
	
	
	@FindBy(how = How.LINK_TEXT , using ="Submit")
	WebElement submit;
	
	
	public void clickonform()
	{
		click.click();
	}
	
	public void writedata() throws IOException
	{
	   Excel excel = new Excel();
	   
	   XSSFSheet sheet =  excel.excelsetup("C:\\Users\\Dell\\Desktop\\data.xlsx");
		
		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		
		for(int i=1 ; i<=rowcount; i++)
		{
			
			name.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
			lastname.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
		
			
	        String s=sheet.getRow(i).getCell(2).getStringCellValue();
	      if(s.equalsIgnoreCase("Single"))
	      {
			martialstatus.click();
			
	      }
			String s1=sheet.getRow(i).getCell(3).getStringCellValue();
		   if(s1.equalsIgnoreCase("Dancing"))  
		   {
			hobby.click();
		   }
			
			//String country2 =sheet.getRow(i).getCell(4).getStringCellValue();
	Select select = new Select(country);
		select.selectByIndex(2);
		
		//((sheet.getRow(i).getCell(4).getStringCellValue()));
		
		
		
		  // String s	=sheet.getRow(i).getCell(5).getStringCellValue();
		  // System.out.println(s);
		   
		  // Double s1	=sheet.getRow(i).getCell(5).getNumericCellValue();
		   //System.out.println(s1);
		   
		   
		  //Date  s2	=sheet.getRow(i).getCell(5).getDateCellValue();
		  //System.out.println(s2);
		   
		  
		
		
			//dateofbirth.sendKeys(s);
			
			//phoneno.sendKeys((String)sheet.getRow(i).getCell(6).getStringCellValue());
			
			username.sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
			email.sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
			aboutyourself.sendKeys(sheet.getRow(i).getCell(9).getStringCellValue());
			password.sendKeys(sheet.getRow(i).getCell(10).getStringCellValue());
			password.submit();
			
		}
		
		
		
	}
}
