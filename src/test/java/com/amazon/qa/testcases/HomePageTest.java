package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amozon.qa.pages.CategoryPage;
import com.amozon.qa.pages.HomePage;

public class HomePageTest extends TestBase
{
	HomePage homepage;
	CategoryPage cartpage;
	 public HomePageTest()
	  {
		  super();
	  }
	
	  @BeforeMethod
      public void setup()
      {
    	 startbrowser();
    	 homepage=new HomePage();
      }	
	  @Test(priority=1)
	  public void test1()
	  {
		 cartpage=homepage.clickoncategory();
	  }
	  
	  @Test(priority=1)
	  public void test2()
	  {
		  boolean txt=homepage.vailidateamzonlink();
		  Assert.assertEquals(txt, "am");
	  }
	   
    	@AfterMethod()
    	public void teardown()
    	{
    		driver.quit();
    	}
    	 
    	  
      
}
