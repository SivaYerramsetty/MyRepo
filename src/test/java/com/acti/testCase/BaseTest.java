package com.acti.testCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.acti.Base.DriverClass;
import com.acti.Pages.DeleteCustomer;
import com.acti.Pages.LoginPageElements;
import com.acti.Pages.TaskPage;


public class BaseTest extends DriverClass {
	
	LoginPageElements lpe ;
	TaskPage TP;
	DeleteCustomer DC;
	public BaseTest()
	{
		super();
	}
	
	@BeforeMethod
	public void preTest()
	{
		initApp();
		lpe = new LoginPageElements();
		TP = new TaskPage();
		DC = new DeleteCustomer();
	}	
	
	@AfterMethod
	public void postTest()
	{
		driver.close();
	}
	

}
