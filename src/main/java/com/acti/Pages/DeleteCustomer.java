package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverClass;

public class DeleteCustomer extends DriverClass {
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]") WebElement customerSearchBox;
	@FindBy(xpath="//span[text()='SivaTest']") WebElement customerCreated;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']") WebElement editButton;	
	@FindBy(className="action") WebElement actionBtn;
	@FindBy(xpath="//div[@class='taskManagement_customerPanel']//div[@class='title'][contains(text(),'Delete')]") WebElement deleteBtn;
	@FindBy(xpath="//span[contains(text(),'Delete permanently')]") WebElement deletePermanentlyBtn;
	
	public DeleteCustomer()
	{
		PageFactory.initElements(driver, this);
	}

	
	public void enterCustomerToSearch(String custName)
	{
		//Common.highLightElement(customerSearchBox);
		customerSearchBox.sendKeys(custName);
	}
	
	public void clickSelectedCustomer()
	{
		//Common.highLightElement(customerCreated);
		customerCreated.click();
	}
	
	public void clickEditButton()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Common.highLightElement(editButton);
		editButton.click();
	}
	
	public void clickActionButton()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Common.highLightElement(actionBtn);
		actionBtn.click();
	}
	
	public void clickDeleteButton()
	{
		//Common.highLightElement(deleteBtn);
		deleteBtn.click();
	}
	
	public void clickDeleltePermanentelyButton()
	{
		//Common.highLightElement(deletePermanentlyBtn);
		deletePermanentlyBtn.click();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
