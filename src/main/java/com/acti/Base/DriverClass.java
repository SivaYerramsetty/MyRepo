package com.acti.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DriverClass {

	public static WebDriver driver;
	public Properties prop;
	
	public DriverClass()
	{
	try
	{
		 File config = new File("./Configuration/config.properties");
		 FileInputStream fis = new FileInputStream(config);
		  Properties prop = new Properties();
		  prop.load(fis);
		  
	}
	catch(Exception e)
	{
		System.out.println("Exception occured" + e.getMessage());
	}
		
	}
	
	public void getdriver()
	{
		  String URL = prop.getProperty("Url");
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(URL);
	}
	
	
	
	
}
