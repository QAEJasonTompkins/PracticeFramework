package com.practice.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.practice.assignments.BrowserSetup;
import com.practice.utilities.BrowserFactory;


public class WebDriverTest {

	//Complete the tests below to the best of your ability in JAVA 
	
	/*
	**Bonus** 
	You have the option to parameterize step 4 to search for 'New York City', 'San Diego', and 'Chicago'.
	*/
	
	WebDriver driver;
	String url = "https://www.yahoo.com";
	
	
	@DataProvider (name ="US Cities")
	public Object[][] dpMethod(){
		return new Object[][] {
			{"New York City"}, 
			{"Chicago"}, 
			{"San Diego"}, 
			{"New Orleans"}};
	}

	
	@Test(dataProvider = "US Cities")
	public void testYahooPage(String cities) {
		
		driver = BrowserSetup.startApplication(driver, "Firefox", "https://www.yahoo.com");

	    
		// Step 1. Assert that we are on the correct page by checking that title = 'Yahoo'
	    
	    	String expectedTitle = "Yahoo";
			String actualTitle = driver.getTitle();
	        SoftAssert softassert = new SoftAssert();

			softassert.assertEquals(actualTitle, expectedTitle);
			System.out.println("The actual Title is " + actualTitle);
	
		// Step 2. Display the count of links under the search bar ('Mail', 'COVID-19', 'News', 'Finance', ...)
		// including 'More...' option
			
			List<WebElement> links = driver.findElements(By.xpath("//a[@class='_yb_56fvw ']"));
			System.out.println("The number of links is " + links.size());
		
		// Step 3. Write an enhanced for-each loop that will print each of the links from step 2
			List<WebElement> hLinks = driver.findElements(By.xpath("//a[@class='_yb_56fvw ']")) ;
			for (WebElement i : hLinks) {
				System.out.println("The links are " + i);	
			}
			
		// Step 4. Enter 'New York City' in the search bar on the top
			driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys(cities);

			
		// Step 5. Click Search button
			driver.findElement(By.xpath("//input[@id='ybar-search']")).click();
			
		// Step 6. Set a 7 second explicit wait for the result of the search
		// Use an appropriate condition of your choice
			WebDriverWait wait= new WebDriverWait(driver, 7);
			WebElement signInButton;
			signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='ysignin']")));

		// Step 7. Click 'Sign In' button on the top right side
			signInButton.click();

		// Step 8. Display the boolean state of the checkbox next to 'Keep me signed in'
			boolean checkbox = driver.findElement(By.xpath("//label[@for='persistent']")).isSelected();
			
			
		// Step 9. Create a logic that will uncheck the checkbox if it is checked 
			WebElement checkBox1 = driver.findElement(By.xpath("//label[@for='persistent']"));
			if(checkBox1.isSelected()) {
				checkBox1.click();
				System.out.println("Checkbox is Toggled off");
			}
			else {
				System.out.println("Checkbox is Toggled on.");
			}
			if(!checkBox1.isSelected()) {
				System.out.println("Checkbox is now Off!!");
			}

		
	}
		


	@AfterTest
	public void tearDown() {
		// Step 10. Close the browser
		BrowserSetup.quitBrowser(driver);
	}

}


