package com.amozon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.utility.Common_Util;

public class HomePage extends TestBase{
     
	@FindBy(id="nav-link-shopall")
	WebElement category;
	
	
	@FindBy(id="nav-cart")
	WebElement cart;
	
	
	@FindBy(xpath="//a[@class='nav-logo-link']")
	WebElement amazonlinklogo;
	
	
	@FindBy(xpath="//a[@class='nav-a'][@tabindex='23']")
	WebElement amazonPaylink;
	
	
	@FindBy(xpath="//a[@class='nav-a'][@tabindex='22']")
	WebElement Todaysdealslink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
		
    public boolean vailidateamzonlink()
	{
		return amazonlinklogo.isDisplayed();
	}


	public CategoryPage clickoncategory()
	{
		category.click();
		return new CategoryPage();
		
	}
    public AmazonpayPage clickonamazonpaylink()
    
    {
    	WebDriverWait wait=new WebDriverWait(driver,30);
    	  
    	wait.until(ExpectedConditions.elementToBeClickable(amazonPaylink));
    	amazonPaylink.click();
    	return new AmazonpayPage();
    }
    
	public TodaydealsPage clickonTodaysdeals()
	{
		Todaysdealslink.click();
		return new TodaydealsPage();
		
	}


	
	
}
