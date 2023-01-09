package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteCustomerPage {
	WebDriver driver;
	
	public DeleteCustomerPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
 public void deletecustomer(String firstname,String lastname, String postcode)
 {
	 WebElement elementCustomer = driver.findElement(By.xpath("//td[text()='"+firstname+lastname+postcode+"']/::i[@button[contains(text(), 'Delete')]"));
	 elementCustomer.click();
	 
 }
}
