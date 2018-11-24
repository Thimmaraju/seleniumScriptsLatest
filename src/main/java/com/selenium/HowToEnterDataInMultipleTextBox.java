package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToEnterDataInMultipleTextBox {
	
	WebDriver driver;
	
	@Test
	public void enterText(){
		
		// First step set the driver location
		// For Window user
		// System.setProperty("webdriver.chrome.driver", "/Users/bsingh5/Documents/coreJava/selenium/drivers/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raju\\git\\seleniumScriptsLatest\\drivers\\chromedriver.exe");
		
		// Create Object of driver.
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Navigate to site
		driver.get("https://www.facebook.com/");
		// Enter data to email
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("test@gmail.com");
		// Enter data to password
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		// Enter first name
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("FirstName");
		// Enter last name
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("LastName");
		// Enter registration email
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("test557@gmail.com");
	}

}
