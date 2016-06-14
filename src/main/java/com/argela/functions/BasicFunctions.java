package com.argela.functions;

import java.util.HashMap;

import org.openqa.selenium.interactions.touch.DownAction;
import com.argela.enumarations.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.ios.IOSDriver;


public class BasicFunctions {

	public static void clickByXpath(IOSDriver<MobileElement> driver,Enumarations iosenum) {
		driver.findElementByXPath(iosenum.getXpath()).click();
	}
	public static void swipeLeftByXPath(IOSDriver<MobileElement> driver, Enumarations iosenum){
		driver.findElementByXPath(iosenum.getXpath()).swipe(SwipeElementDirection.LEFT, 10, 10, 500);
	}
	public static void swipeRightByXPath(IOSDriver<MobileElement> driver, Enumarations iosenum){
		driver.findElementByXPath(iosenum.getXpath()).swipe(SwipeElementDirection.RIGHT, 10, 10, 500);
	}
	


}