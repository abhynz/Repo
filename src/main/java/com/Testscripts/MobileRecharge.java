package com.Testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.Base.BaseClass;
import com.Pages.Homepage;

import Locators.Locators;

public class MobileRecharge extends BaseClass implements Locators {

	WebDriver driver;
	Homepage hp;

	public MobileRecharge(WebDriver driver) {
		super();
		this.driver = driver;
	}
	

	@Test
	public void rechargeUsingMobilenumber()
	{
		System.out.println("----------- Starting the Tests");
		initialiseBaseSetup("chrome", "https://paytm.com/");
		hp = new Homepage(driver);
		hp.txtbox_Mobilenumber("9581099400");
	}
}
