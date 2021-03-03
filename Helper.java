package com.practice.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	//For handling Screenshots, alerts, frames, windows etc.
	
	public static void captureScreenshot(WebDriver driver)
	{
		
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try 
	{
		FileHandler.copy(src, new File("./Screenshots/HeroApp.png"));
		
		System.out.println("Screenshot captured successfully");
		
	} catch (IOException e) {
		
		System.out.println("Unable to capture screenshot"+e.getMessage());
	}
		
	}

}
