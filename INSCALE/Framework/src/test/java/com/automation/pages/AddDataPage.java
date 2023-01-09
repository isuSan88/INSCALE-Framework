package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.automation.utility.ReadXL;

public class AddDataPage {
	
	WebDriver driver;
	public AddDataPage(WebDriver ldriver) 
	{
		this.driver=ldriver;
	
	}
	@FindBy(xpath="//input[@ng-model='fName']") WebElement firstname;
	
	@FindBy(xpath="//input[@ng-model='lName']") WebElement lastname;
	
	@FindBy(xpath="//input[@ng-model='postCd']") WebElement postcode;
	
	@FindBy(xpath="//button[@class='btn btn-default' and text()='Add Customer']") WebElement addingCustomerButton;

	@Test(dataProviderClass = ReadXL.class,dataProvider = "AddCustomer")
	public void addingData(String CustFirstName, String CustLastName, String CustPostCode)
	{
		firstname.clear();
		firstname.sendKeys(CustFirstName);
		lastname.clear();
		lastname.sendKeys(CustLastName);
		postcode.clear();
		postcode.sendKeys(CustPostCode);
		addingCustomerButton.click();
		driver.switchTo().alert().accept();
	}

	

}
