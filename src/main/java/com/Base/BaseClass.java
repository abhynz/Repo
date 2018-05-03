package com.Base;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseClass {

	private WebDriver driver;
	Logger log = Logger.getLogger("BaseClass");

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	@Parameters("browserType")
	public void initialiseBaseSetup(@Optional("firefox") String browserType, String URL){
		try{
			initiateDriver(browserType,URL);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println("-------- Could not able to launch driver");
		}
	}


	public void initiateDriver(String browser, String Url) {
	if(browser.equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Url);
		log.info("************* LAUNCHED :: "+Url);
	}
		
	}

}