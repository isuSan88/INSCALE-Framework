package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage {
	WebDriver driver;
	
	public AddCustomerPage(WebDriver ldriver) 
	{
		
		this.driver=ldriver;
		
	}
	@FindBy(xpath="//button[contains(text(), 'Add Customer')]") WebElement addCustButton;

	public void addCut() {
		addCustButton.click();
	}
}
