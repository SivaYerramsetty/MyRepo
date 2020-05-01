package com.acti.testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.acti.Pages.TaskPage;


public class TestCreateCustomer extends BaseTest{
	
	
	@Test(priority=1)
	public void CreateCustomer()
	{
		lpe.validateLogin("admin", "manager");
		TP.ClickMainTask();
		TP.ClickOnNew();
		TP.ClickOnNewCus();
		TP.EnterCusName("SivaTest");
		TP.ClickSave();
		
	}
	
	

}
