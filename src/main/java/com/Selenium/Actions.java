package com.Selenium;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Actions {

	WebDriver driver;
	
	Logger log = Logger.getLogger("Actions");
	
	public Actions(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	public void safeType(By locator, String value)
	{
		driver.findElement(locator).sendKeys(value);
		log.info("Entered :: "+ value);
	}
	
	
}
