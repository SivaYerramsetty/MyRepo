package com.acti.Base;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class DriverClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public DriverClass()
	{
	try
	{
		 File config = new File("./Configuration/config.properties");
		 FileInputStream fis = new FileInputStream(config);
		  prop = new Properties();
		  prop.load(fis);
		  
	}
	catch(Exception e)
	{
		System.out.println("Exception occured" + e.getMessage());
	}
		
	}
	
	public void initApp()
	{
		  String B = prop.getProperty("Browser1");
		if(B.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(B.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Browsers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String URL = prop.getProperty("url");
		driver.get(URL);
	}
	
	
	
	
}
