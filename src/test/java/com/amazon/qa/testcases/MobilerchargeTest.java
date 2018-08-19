package com.amazon.qa.testcases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.utility.Common_Util;
import com.amozon.qa.pages.AmazonpayPage;
import com.amozon.qa.pages.HomePage;
import com.amozon.qa.pages.MobileRechargePage;


public class MobilerchargeTest extends TestBase
{
	HomePage homepage;
	AmazonpayPage  amazonpay;
	MobileRechargePage recharge;
	Common_Util u1;
	public MobilerchargeTest()
	  {
		  super();
	  }
	 @BeforeMethod
     public void setup()
     {
   	   startbrowser();
   	   homepage=new HomePage();
   	   amazonpay=homepage.clickonamazonpaylink();   	   
 	   //recharge=amazonpay.click();
   	   recharge=new MobileRechargePage();
   	   u1=new Common_Util();
   			   
     }	
	 
	 
	 @Test(priority=1,dataProvider="getamazontestdata")
	 public void filldata(String Mobilenumber,String amount)	 
	 {
		 
		 recharge=amazonpay.click(); 
		 recharge.enteralldata(Mobilenumber, amount);
	 }
	 @DataProvider
	 public Object[][] getamazontestdata()
	 {
		 Object d[][]=Common_Util.getdata("Addmoney");
		 return d;
	 }
	 
	@AfterMethod()
 	public void teardown()
 	{
 		driver.quit();
 		
 		 
 	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

