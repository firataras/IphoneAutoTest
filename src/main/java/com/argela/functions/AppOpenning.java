package com.argela.functions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class AppOpenning{
	
	public static void handlefirstmessage (IOSDriver<MobileElement> driver){
		
		System.out.println("First Page warning message handling ........");
		System.out.println(".");

		boolean result = true;
		do {
			System.out.print(".");
			if (driver.findElementByXPath("//UIAApplication[1]/UIAWindow[7]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]").isDisplayed())
			{
				driver.findElementByXPath("//UIAApplication[1]/UIAWindow[7]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]").click();
				System.out.println("OK button was clicked");
				result  = false;
			}
					
			
		} while (result);
		System.out.println("First Page verification completed with 'OK' ");
	}
	
	public static void handlefirstmessage1 (IOSDriver<MobileElement> driver){
		System.out.println("First Page warning message handling ........");
		driver.findElementByXPath("//UIAApplication[1]/UIAWindow[7]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]").click();
		System.out.println("First Page verification completed with 'OK' ");
	}
	public static void handlesecondmessage (IOSDriver<MobileElement> driver){
		System.out.println("Second Page warning message handling ........");
		System.out.println(".");
		boolean result = true;
		do {
			System.out.print(".");
			if (driver.findElementByXPath("//UIAApplication[1]/UIAWindow[7]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]").isDisplayed())
			{	driver.findElementByXPath("//UIAApplication[1]/UIAWindow[7]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]").click();
				System.out.println("OK button was clicked");
				result  = false;
			}
		} while (result);
		System.out.println("Second Page verification completed with 'OK' ");
	}
	public static void handlesecondmessage1(IOSDriver<MobileElement> driver){
		System.out.println("Second Page warning message handling ........");
		System.out.println(".");
		driver.findElementByXPath("//UIAApplication[1]/UIAWindow[7]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]").click();
		System.out.println("OK button was clicked");
		System.out.println("Second Page verification completed with 'OK' ");
	}

}
