package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverClass;

public class TaskPage extends DriverClass{
	 @FindBy(id="container_tasks") WebElement TaskMenu ;
	 @FindBy(xpath = "//div[@class='addNewContainer']") WebElement newtask ;
	 @FindBy(xpath = "//div[@class='item createNewCustomer']") WebElement newbuttonclick ;
	 @FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement EnterCName ;
	 @FindBy(xpath = "//div[@class='commitButtonPlaceHolder']") WebElement ClickBtn ;
	 
	 
	
	public TaskPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickMainTask()
	{
		TaskMenu.click();
	}
	public void ClickOnNew()
	{
		newtask.click();
	}
	public void ClickOnNewCus()
	{
		newbuttonclick.click();
	}
	public void EnterCusName(String custname)
	{
		EnterCName.sendKeys(custname);
	}
	public void ClickSave()
	{
		ClickBtn.click();
	}
	
	

}
