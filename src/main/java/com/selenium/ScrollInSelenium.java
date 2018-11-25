package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollInSelenium {

	WebDriver driver;
	@Test
	public void scrollInSelenium() throws InterruptedException {
		// First step set the driver location
		// For Window user
		// System.setProperty("webdriver.chrome.driver", "/Users/bsingh5/Documents/coreJava/selenium/drivers/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raju\\git\\seleniumScriptsLatest\\drivers\\chromedriver.exe");
		// create driver object	
		driver = new ChromeDriver();
		
		driver.get("https://www.tirerack.com/content/tirerack/desktop/en/homepage.html");
		
		driver.findElement(By.xpath("/html/body/div[8]/div/span")).click();
		
		// it will go till the end vertically
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(3000);
		// it will come up vertically
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(3000);
		
		// it will go till the pixel specified
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);
		
		// it will come back till the pixel specified
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1500)");
		
		Thread.sleep(3000);
		
		// it will go down till the object specified.
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//a[contains(text(),'Find')]")));
	    
	}
}
