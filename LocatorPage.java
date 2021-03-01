package com.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



//createed this class to clean up and minimize the amount of hard coded data in main scripts 
public class LocatorPage {
	
	WebDriver driver;
	
	public LocatorPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}

	@FindBy(xpath= "//a[@href='/dropdown']") WebElement dropDown;
	@FindBy(xpath= "//select[@id='dropdown']") WebElement drpDown;
	@FindBy(xpath= "//a[@href= '/checkboxes']") WebElement Checkboxes;
	@FindBy(xpath= "//input[@type= 'checkbox']") WebElement checkBox1;
	@FindBy(xpath= "//input[@type= 'checkbox']//following::input[1]") WebElement checkBox2;
	@FindBy(xpath= "//a[text()= 'Add/Remove Elements']") WebElement add;
	@FindBy(xpath= "//button[@onclick='addElement()']") WebElement create;
	@FindBy(xpath= "//button[@onclick='deleteElement()']") WebElement delete1;
	
	public void HandlingDropdown()
	{
		dropDown.click();
		Select sel = new Select(drpDown);
		sel.selectByVisibleText("Option 1");
		
		//this method chooses the first option within the dropdown menu and confirms it
		WebElement firstEle = sel.getFirstSelectedOption();
		System.out.println("first element = " +firstEle.getText());
		
		//this loops and displays the options available within the dropdown menu
		java.util.List<WebElement> listOptions = sel.getOptions();
		for (WebElement webElement : listOptions) {
			System.out.println("options -"+webElement.getText());
	}
		
}
			
	public void TestingRadio()
		{
			Checkboxes.click();
	        WebDriverWait wait= new WebDriverWait(driver, 10);
	        checkBox1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type= 'checkbox']")));
	        checkBox1.click();
	        System.out.println("Checkbox1 is Selected");
	        
	        if (checkBox1.isSelected()) {
	        System.out.println("Checkbox 1 is Toggled On");
	        }
	        else {
	        	System.out.println("Checkbox 1 is Toggled Off");
	        }
	        
	        //Selecting and Verifying is checkbox 2 has been deselected
	        if(checkBox2.isSelected()) {
	        System.out.println("Checkbox 2 is Toggled On");
	        }
	        else {
	        checkBox2.click();
	        System.out.println("Checkbox 2 is Toggled Off");

		}
	
}
	public void ElementCreation()
	{
        System.out.println("Back at Main Screen");
        add.click();
        
        WebDriverWait wait1=new WebDriverWait(driver, 10);
        WebDriverWait wait2=new WebDriverWait(driver, 10);
        
        create = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick='addElement()']")));
        create.click();
        System.out.println("An Element has been created");
        
        delete1 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='elements']")));
        
        delete1.click();
        System.out.println("An Element has been deleted");
        
        
	}
	
}


