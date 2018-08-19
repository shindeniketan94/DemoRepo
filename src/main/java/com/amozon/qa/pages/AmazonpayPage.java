package com.amozon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class AmazonpayPage extends TestBase
{
	@FindBy(xpath="//a[text()='Add Money']")
	WebElement AddMoney;
	
	
	@FindBy(linkText="Mobile Recharge")
	WebElement MobileRecharge;
	
	@FindBy(xpath="//a[text()='Help and FAQs']")
	WebElement Heplandfaq;
	
	@FindBy(xpath="//a[text()='Hello.Sign in']")
	WebElement sigin;
	
	public AmazonpayPage()
	{
		PageFactory.initElements(driver, this);
	}
	public AddMoneyPage clickonAddMoney()
	{
		AddMoney.click();
		return new AddMoneyPage();
	}

	
	//public MobilrRechargePage clickonmobilerecharge()
	//{
		//MobileRecharge.click();
		//return new MobilrRechargePage();
	//}
	public MobileRechargePage click(){
		MobileRecharge.click();
		return new MobileRechargePage();
	}
	
}
