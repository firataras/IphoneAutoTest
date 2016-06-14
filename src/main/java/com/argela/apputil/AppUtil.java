package com.argela.apputil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class AppUtil {
	 
	private static AppUtil appUtil;
	private IOSDriver<MobileElement> driver; 
	private AppUtil() throws MalformedURLException{
	   driver = setUp();
	}
	public static AppUtil sharedInstance(){
		 if (appUtil == null){
			 try {
				appUtil = new AppUtil();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
		 return appUtil;
	 } 
	
	 public IOSDriver<MobileElement> getDriver() {
		return driver;
	}
	public static boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	private  IOSDriver<MobileElement> setUp() throws MalformedURLException{
		
		IOSDriver<MobileElement> driver;
		AppiumCapabilities ac = null;
		DesiredCapabilities dc = new DesiredCapabilities();
		
		//Hangi capability istenirse onun indexini buraya yazmak lazim
		int ac_index =AppiumCapabilities.Iphone6.getIndex();  
		
		
		
		dc.setCapability("platformName", ac.values()[ac_index].getPlatformName());
		dc.setCapability("platformVersion",ac.values()[ac_index].getPlatformVersion());
		dc.setCapability("deviceName",ac.values()[ac_index].getDeviceName());
		dc.setCapability("fullReset", ac.values()[ac_index].getFullReset());
		dc.setCapability("app-Package", ac.values()[ac_index].getAppPackage());
		dc.setCapability("unicodeKeyboard", ac.values()[ac_index].getUnicodeKeyboard());
		dc.setCapability("waitForAppScript", "8000");
		dc.setCapability("app", "/Users/ismailfirataras/Library/Developer/Xcode/DerivedData/WirofonNext-atkldebvevgvbdbjkeahkdnffswl/Build/Products/Debug-iphonesimulator/WirofonNext.app");

		System.out.println("Getting Driver ");
		
		
		driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("                                                                             ");

		return driver;
	}
	/**
	 * Initial Screen Test
	 * @param driver
	 * @throws InterruptedException
	 */


}
