package com.argela.enumarations;


public enum Enumarations {



	//WirofonAccesYourContratNotification
	WirofonAccesYourContratNotificationOK(0, "OK","UIAButton", null, "OK", true, false, true, "//UIAApplication[1]/UIAWindow[7]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]"),
	WirofonAccesYourContratNotificationDONTALLOW(1, "Don’t Allow","UIAButton", null, "Don’t Allow", true, false, true, "//UIAApplication[1]/UIAWindow[7]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]"),

	//WirofonSendYouNotification
	WirofonSendYouNotificationOK(0, "OK","UIAButton", null, "OK", true, false, true, "//UIAApplication[1]/UIAWindow[7]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]"),
	WirofonSendYouNotificationDONTALLOW(1, "Don’t Allow","UIAButton", null, "Don’t Allow", true, false, true, "//UIAApplication[1]/UIAWindow[7]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]"),
	
	

			
	
	//GirisYapButon ve Hesap Olustur Buton Sayfasi  
	GirisYapButton(2, "Giriş Yap","UIAButton", null, "Giriş Yap", true, false, true, "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]"),
	HesapOlusturButton(3, "Hesap Oluştur", "UIAButton", null, "Hesap Oluştur",true, false, true, "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]"), 
	
	//TutorialScreen 
	TutorialScreen(4,"tutorial_screen","UIAImage", null, null,true, false, true, "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAImage[1]"),
	TotorialScreenCloseIcon(5,"close icon","UIAButton",null,"close icon",true,false,true,"//UIAApplication[1]/UIAWindow[1]/UIAButton[1]"),
	ScrollView(6,null,"UIAScrollView", null, null,true, false, true, "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]"),
	WhiteNextArrow(7,"white_next_arrow","UIAImage", null, null,true, false, true, "//UIAApplication[1]/UIAWindow[1]/UIAImage[1]"),
	KullanmayaBasla(8,"Kullanmaya Başla","UIAStaticText", "Kullanmaya Başla", "Kullanmaya Başla",true, false, true, "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]"),
	PageIndicator(9,null,"UIAPageIndicator", "page 1 of 4", null,true, false, true, "//UIAApplication[1]/UIAWindow[1]/UIAPageIndicator[1]");

	

			
			
			
	
	private int index;
	private String name;
	private String type;
	private String value;
	private String label;
	private boolean enabled;
	private boolean visible;
	private boolean valid;
	private String xpath;
	
	

	private Enumarations(int index,String name, String type,String value,String label, 	 boolean enabled,  boolean visible, boolean valid, String xpath) {
		
		this.index = index;
		this.name = name;
		this.type = type;
		this.value = value;
		this.label = label;
		this.enabled = enabled;
		this.visible = visible;
		this.valid = valid;
		this.xpath = xpath;
		
		
	}
	public int getIndex() {
		return index;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String getValue() {
		return value;
	}
	public String getLabel() {
		return label;
	}

	public boolean getEnabled() {
		return enabled;
	}
	public boolean getVisible() {
		return visible;
	}	
	public boolean getValid() {
		return valid;
	}	
	
	public String getXpath() {
		return xpath;
	}

	
	

}
	

