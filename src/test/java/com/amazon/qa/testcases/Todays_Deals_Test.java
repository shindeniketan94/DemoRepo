package com.amazon.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;



import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amozon.qa.pages.HomePage;
import com.amozon.qa.pages.TodaydealsPage;

public class Todays_Deals_Test extends TestBase

{
    HomePage homepage;
    
    TodaydealsPage  Todaydeals;
    
    public Todays_Deals_Test()
    {
    	super();
    }
    @BeforeMethod
    public void setup()
    {
    	 startbrowser();
    	 homepage=new HomePage();
    	 Todaydeals=homepage.clickonTodaysdeals();
    }
    @Test
    public void starttest()
    {
    	Todaydeals.clickcheckbox();
    	
    }
    
    
    
    
    
    
    
    
    
}
