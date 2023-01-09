package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagerPage {
	
	WebDriver driver;

	public ManagerPage(WebDriver ldriver)
	{
		
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg' and text()='Bank Manager Login']") WebElement managerButton;

public void manager() {
	managerButton.click();
}


	
	
	
}
