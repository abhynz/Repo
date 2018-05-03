package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	static WebDriver driver; 
	public static WebDriver init()
	{
		return driver = new FirefoxDriver();
	}
}
