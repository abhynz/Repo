package com.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Selenium.Actions;

import Locators.Locators;

public class Homepage extends Actions implements Locators{

	WebDriver driver;
	WebElement element;
	//Actions ae;
	Logger log = Logger.getLogger("Homepage");
	
	

	public Homepage(WebDriver driver) //getDriver()
	{
		super(driver); //getDriver();
		//this.driver = driver;
	}

	public void txtbox_Mobilenumber(String value, int timetoWait)
	{
		System.out.println("Trying to enter Mobile number");
		safeType(Locators.hp_input_Mobilenumber,value,timetoWait);
	}
	


	public WebElement txtbox_Operator()
	{
		element = driver.findElement(Locators.hp_input_Operator);
		return element;
	}
	
	public WebElement txtbox_Amount()
	{
		element = driver.findElement(Locators.hp_input_Amount);
		return element;
	}
	
	public WebElement btn_ProceedtoRecharge()
	{
		element = driver.findElement(Locators.hp_Btn_ProceedToRech);
		return element;
	}
}
