package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.acti.Base.DriverClass;

public class LoginPageElements extends DriverClass {

	@FindBy(id = "logoContainer")
	WebElement logo;
	@FindBy(id = "username")
	WebElement usernametb;
	@FindBy(name = "pwd")
	WebElement Pwdtb;
	@FindBy(id = "loginButtonContainer")
	WebElement loginbutton;

	public void inti() {
		PageFactory.initElements(driver, this);
	}

	
	public boolean checklogo() {

		return logo.isDisplayed();
	}

	@Test(priority=1)
	public void validatelogin(String un, String pw) 
	{
	 un = prop.getProperty("username");
	 pw = prop.getProperty("pwd");
		usernametb.sendKeys(un);
		Pwdtb.sendKeys(pw);
		loginbutton.click();	
		
	}
	

}
