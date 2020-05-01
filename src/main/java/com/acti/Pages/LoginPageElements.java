package com.acti.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.acti.Base.DriverClass;

public class LoginPageElements extends DriverClass {

	@FindBy(id="logoContainer") WebElement actiLogo;
	@FindBy(id="username") WebElement usernameTb;
	@FindBy(name="pwd") WebElement passwordTb;
	@FindBy(id="loginButton") WebElement loginBtn;

	public LoginPageElements()
	{
		PageFactory.initElements(driver, this);
	}

	
	public boolean verifyActiLogo()
	{
		return actiLogo.isDisplayed();
	}


	public void validateLogin(String username, String password)
	{
		
		usernameTb.sendKeys(username);
		
		passwordTb.sendKeys(password);
		
		loginBtn.click();
	}
	
	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
	}
	

}
