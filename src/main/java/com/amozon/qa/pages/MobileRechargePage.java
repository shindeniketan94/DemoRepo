package com.amozon.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class MobileRechargePage extends TestBase 
{
	@FindBy(name="phoneNumber")
	@CacheLookup
	WebElement number;
	
	
	@FindBy(xpath="//input[@id='operatorAndCircleTextInputId']")
	WebElement operator;
	
	
	@FindBy(name="rechargePlan")
	WebElement plan;
	
	@FindBy(name="Buy")
	WebElement pay;
	
	
	public MobileRechargePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonpay()
	{
		JavascriptExecutor je=(JavascriptExecutor)driver;
  	    je.executeScript("scroll(0,200)");		
		pay.click();
	}
	
	public void enteralldata(String num,String pl)
	{
		number.sendKeys(num);
		//operator.sendKeys(op);
		plan.sendKeys(pl);
	}
}
