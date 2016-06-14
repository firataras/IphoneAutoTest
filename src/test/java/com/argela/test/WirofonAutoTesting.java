package com.argela.test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AppUtil.AppUtil;
import AppUtil.BasicFunctions;
import AppUtil.Enumarations;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;


public class WirofonAutoTesting {
	private static IOSDriver<MobileElement> driver;
	
	//@Test(priority = 1, groups = "Test")
	@BeforeClass(alwaysRun=true)
	public void Driver() {
		driver = AppUtil.sharedInstance().getDriver();
	}

	@Test(groups = {"p1", "Notification Tests"})
	public void WarningPage() {
		
		BasicFunctions.clickByXpath(driver, Enumarations.WirofonAccesYourContratNotificationOK);
		BasicFunctions.clickByXpath(driver, Enumarations.WirofonSendYouNotificationOK);
	}

	@Test(groups = {"p2", "Giris Yap Page Tests"}, dependsOnMethods="WarningPage")
	public void Giris() {
		
		BasicFunctions.clickByXpath(driver, Enumarations.GirisYapButton);
		BasicFunctions.swipeLeftByXPath(driver, Enumarations.ScrollView);
		BasicFunctions.swipeLeftByXPath(driver, Enumarations.ScrollView);
		BasicFunctions.swipeLeftByXPath(driver, Enumarations.ScrollView);
		BasicFunctions.swipeLeftByXPath(driver, Enumarations.ScrollView);
		BasicFunctions.clickByXpath(driver, Enumarations.TotorialScreenCloseIcon);
	}
	
	@AfterClass(alwaysRun=true)
	public void closeDriver() {
		driver.quit();
	}
	
	
}


