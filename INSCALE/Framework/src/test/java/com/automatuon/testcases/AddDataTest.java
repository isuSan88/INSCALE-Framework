package com.automatuon.testcases;


import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.automation.pages.AddCustomerPage;
import com.automation.pages.AddDataPage;
import com.automation.pages.BaseClass;
import com.automation.pages.CustomerPage;
import com.automation.pages.DeleteCustomerPage;
import com.automation.pages.ManagerPage;
import com.automation.utility.Helper;
import com.automation.utility.ReadXL;



public class AddDataTest extends BaseClass{
	
	

	
	@Test(priority = 0)
	public void LoginManager() throws InterruptedException
	{
		ManagerPage managerpage=PageFactory.initElements(driver, ManagerPage.class);
		managerpage.manager();
		Thread.sleep(1000);
	}
	@Test (priority = 1)
	public void LandAddCustomer() throws InterruptedException
	{
	AddCustomerPage addcustomerpage=PageFactory.initElements(driver,AddCustomerPage.class);
	addcustomerpage.addCut();
	Thread.sleep(1000);
	}
	
	
	
	
	/*
	@Test(priority = 2)
	public void AddCustomer() throws IOException
	{
	
		ReadXL xladddata = new ReadXL();
	AddDataPage adddatapage=PageFactory.initElements(driver,AddDataPage.class);
	adddatapage.addingData(xladddata.getData(addingData), xladddata.getData(addingData), xladddata.getData(addingData));

	
	}*/
	
	@Test(priority = 3)
	 public void Customer() throws InterruptedException
	 {
		CustomerPage customerpage=PageFactory.initElements(driver,CustomerPage.class);
		customerpage.customer();
		Helper.captureScreenshot(driver);
		Thread.sleep(1000);
	 }
	@Test(priority = 4)
	public void DeleteCustomer()
	{
		DeleteCustomerPage deletecustomer= PageFactory.initElements(driver, DeleteCustomerPage.class);
		deletecustomer.deletecustomer("FirstName", "LastName", "Postcode");
		Helper.captureScreenshot(driver);
	}
	
	
	
	}



	

