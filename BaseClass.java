package com.practice.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.practice.utilities.BrowserFactory;
import com.practice.utilities.ConfigDataProvider;
import com.practice.utilities.Helper;

public class BaseClass {
	
	public WebDriver driver;
	public ConfigDataProvider config;
	
	
 	@BeforeSuite
	public void setUpSuite()
	{
		config = new ConfigDataProvider();
	}
	
	@BeforeTest
	public void setup() 
	{
	
		driver = BrowserFactory.startApplication(driver, "Firefox", "https://the-internet.herokuapp.com/");
		
	}
	
	@AfterTest
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}

	
	@AfterMethod
	public void tearDownMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.captureScreenshot(driver);

		}
	}
}
