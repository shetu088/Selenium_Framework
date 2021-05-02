package Utilities;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	
	public XSSFSheet excelsetup(String path) throws IOException
	{
		FileInputStream filestream = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(filestream);
		XSSFSheet sheet = workbook.getSheet("data");
		return sheet;
		
	
	}

}
