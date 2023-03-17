package com.ps.pages.mobile.enums;

public enum ViewScreenMenuItemType {
	
	WEB_VIEW("WebView"),
	WEB_VIEW_2("WebView2"),
	TEXT_SWITCHER("TextSwitcher"),
	LISTS("Lists"),
	TABS("Tabs");
	
	private final String name;
	
	public String getName() {
		return name;
	}
	
	ViewScreenMenuItemType(String name) {this.name = name;}

}
