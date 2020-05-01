package com.acti.testCase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TestDeleteCustomer extends BaseTest {
	
   @Test(priority=2)
	public void DeleteCustomer()
	{
		lpe.validateLogin("admin", "manager");
		TP.ClickMainTask();
		DC.enterCustomerToSearch("SivaTest");
		DC.clickSelectedCustomer();
		DC.clickEditButton();
		DC.clickActionButton();
		DC.clickDeleteButton();
		DC.clickDeleltePermanentelyButton();
		
	}
}
