package com.practice.testcases;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.practice.utilities.BrowserFactory;
import com.practice.pages.LocatorPage;

public class HeroApp {
	
	WebDriver driver;
	
	//Testing the dropdowns and verifying the options in this function
	@Test (priority = 1)
	public void DropdownPrac()
	{
		
		driver=BrowserFactory.startApplication(driver, "Firefox", "https://the-internet.herokuapp.com/");
		
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		LocatorPage locatorPage = PageFactory.initElements(driver, LocatorPage.class);
		
		locatorPage.HandlingDropdown();
		
		}
		
	
	
	//Testing the Checkboxes and verifying if the selections are viable
	@Test (priority =2)
	public void CheckBoxes()
	
	{
        driver.navigate().to("https://the-internet.herokuapp.com/");

        LocatorPage locatorPage = PageFactory.initElements(driver, LocatorPage.class);

        locatorPage.TestingRadio();
	}
	
	//Testing the AddRemoveElemnents Function
	@Test (priority =3)
	public void AddRemoveElements()
	
	{
        driver.navigate().to("https://the-internet.herokuapp.com/");
        
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        LocatorPage locatorPage = PageFactory.initElements(driver, LocatorPage.class); 
        
        locatorPage.ElementCreation();
        
        BrowserFactory.quitBrowser(driver);
	}
	
	
	
}
