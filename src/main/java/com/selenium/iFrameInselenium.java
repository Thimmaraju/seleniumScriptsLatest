package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrameInselenium {

	WebDriver driver;
	
	@Test
	public void enterText(){
		
		// First step set the driver location
		// For Window user
		// System.setProperty("webdriver.chrome.driver", "/Users/bsingh5/Documents/coreJava/selenium/drivers/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raju\\git\\seleniumScriptsLatest\\drivers\\chromedriver.exe");
		
		// Create Object of driver.
		driver = new ChromeDriver();
		
		// An implicit wait tells WebDriver to poll the DOM for a certain amount of time when trying to find an element
		// or elements if they are not immediately available.
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("file:///C:/startbootstrap-sb-admin-2-gh-pages/startbootstrap-sb-admin-2-gh-pages/pages/forms.html");
		// switch frame based on index
		//driver.switchTo().frame(0);
		// switch frame based on frame name
		//driver.switchTo().frame("nameOfIframe");
		// switch frame based on web element
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div[2]/iframe")));
		// when you have frame within frame
		//driver.switchTo().frame(0).switchTo().frame(2);
		//driver.switchTo().frame("nameOfIframe").switchTo().frame("name");
		// when you have frame within frame
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='frame.html']"))).switchTo().frame("name");
		
		driver.findElement(By.xpath("/html/body/div/form/div/input[1]")).sendKeys("userName");
		
		driver.findElements(By.xpath("//*[@id=\"age\"]")).get(0).sendKeys("27");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div[1]/form/div[1]/input[1]")).sendKeys("123455");
	}
}
