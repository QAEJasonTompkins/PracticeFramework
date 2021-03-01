package com.practice.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//This class here sets up the web browser and includes an if/else statement that would let you choose between either chrome or firefox
public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL)
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		else
		{
			System.out.println("We do not support this browser.");
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}	
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
}
