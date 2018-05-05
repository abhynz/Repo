package com.Testscripts;

import org.testng.annotations.Test;
import com.Base.BaseClass;
import com.Pages.Homepage;
import Locators.Locators;

public class MobileRecharge extends BaseClass implements Locators {

	Homepage hp;
	@Test
	public void rechargeUsingMobilenumber()
	{
		System.out.println("----------- Starting the Tests");
		initialiseBaseSetup("chrome");
		getDriver().get("https://paytm.com/");
		hp = new Homepage(getDriver());
		hp.txtbox_Mobilenumber("9581099400",30);
	}
}
