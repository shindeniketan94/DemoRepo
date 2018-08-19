package com.amozon.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.qa.base.TestBase;

public class TodaydealsPage extends TestBase
{
  
	 
	
   @FindBy(xpath="//*[@id='widgetFilters']/div[1]/div[2]/span[1]/div/label/span")
   WebElement appliancecheckbox;
   
   
   @FindBy(xpath="//span[@data-action='a-dropdown-button']")
   WebElement dropdownbutton;
   
   
   public TodaydealsPage()
   {
	 
	   PageFactory.initElements(driver, this);
   }
   
   
   public void clickcheckbox()
   {
	   JavascriptExecutor jc= (JavascriptExecutor) driver;
       
      jc.executeScript("arguments[0].scrollIntoView(true);",appliancecheckbox);
	   
	   appliancecheckbox.click();
   }
   
   public void selectdropdown()
   {
   JavascriptExecutor jc= (JavascriptExecutor) driver;
       
       jc.executeScript("arguments[0].scrollIntoView(true);",dropdownbutton);
	   
	   dropdownbutton.click();
	   
	   Select se=new Select(dropdownbutton);
	   
	   se.selectByIndex(3);
   }
}
