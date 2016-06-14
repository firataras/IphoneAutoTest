package AppUtil;

public enum AppiumCapabilities {
	
	AppleTV1080p(0,"","iOS","9.3","Apple TV 1080p",false,true,"tr.com.argela.inhouse.relansman.wirofon"),
	Iphone6(1,"","iOS","9.3","iPhone 6",false,true,"tr.com.argela.inhouse.relansman.wirofon"),
	EndOfCapabilities(999999,null,null,null,null,false,true,null);
	
	

	private int index;
	private String browserName;
	private String platformName;
	private String platformVersion;
	private String deviceName;
	private boolean fullReset;
	private boolean unicodeKeyboard;
	private String appPackage;

	private AppiumCapabilities(int index,String browserName,String platformName,String platformVersion, String deviceName , boolean fullReset, boolean unicodeKeyboard, String appPackage) {

		this.index = index;
		this.browserName = browserName;
		this.platformName = platformName;
		this.platformVersion = platformVersion;
		this.deviceName = deviceName;
		this.fullReset = fullReset;
		this.unicodeKeyboard = unicodeKeyboard;
		this.appPackage = appPackage;
		
	}
	
	public int getIndex() {
		return index;
	}
	
	public String getBrowserName() {
		return browserName;
	}
	public String getPlatformName() {
		return platformName;
	}
	public String getPlatformVersion() {
		return platformVersion;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public boolean getFullReset() {
		return fullReset;
	}
	public boolean getUnicodeKeyboard() {
		return unicodeKeyboard;
	}
	public String getAppPackage() {
		return appPackage;
	}

	

}
