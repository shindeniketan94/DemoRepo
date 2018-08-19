package com.amazon.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common_Util

{
	 static XSSFWorkbook wb;
	 static XSSFSheet sheet1;
	
	 static WebDriver driver;  
	
	static final String Filepath="C:\\Users\\mahadev shinde\\workspace\\Amazon\\src\\main\\java\\com\\amazon\\qa\\testdata\\addmoney.xlsx";
  
  public static Object[][] getdata(String sheetname) 
  {
	   
	     File src=new File(Filepath);  //specify where test sheet is located
		
		FileInputStream fis;
		try 
		{
			fis = new FileInputStream(src);  		
		
			wb = new XSSFWorkbook(fis);
			//sheet1=wb.getSheetAt(0);
		}
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}  
	  
	  
	 sheet1= wb.getSheet(sheetname);
	 
	 int row=sheet1.getLastRowNum();
	 
	 System.out.println(row);
	 
	 Row row1=sheet1.getRow(0);
	 
	 int colums=row1.getLastCellNum();
	 System.out.println(colums);
	 
	 Object[][] d=new Object[row][colums];
	 
	 for(int i=0;i<row;i++)
	 {
		 for(int j=0;j<colums;j++)
		 {
			 d[i][j]=sheet1.getRow(i+1).getCell(j).getStringCellValue();
		 }
	 }
	  return d;
  }
  
  
  public static void Waitforelement(WebElement ele)
  {
	  WebDriverWait wait=new WebDriverWait(driver,10);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(ele));
  }
}
	  
	  
	  
	  
	  
	  
	  
	  
	  





  
  
  
  
  
  
  
  
  
  
  
  

