package com.Selenium;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Actions extends Sync {

	WebDriver driver;
	WebElement ele;
	Logger log = Logger.getLogger("Actions");
	boolean s;


	public Actions(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void safeType(By locator, String value, int waitTime)
	{
		s = isElementDisplayed(locator,waitTime);
		if(s){
			driver.findElement(locator).sendKeys(value);
			log.info("Entered :: "+value);
		}
	}
}
