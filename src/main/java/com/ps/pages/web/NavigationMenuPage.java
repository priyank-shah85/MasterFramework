package com.ps.pages.web;

import com.ps.pages.web.enums.navigationmenucomponent.MenuType;
import com.ps.pages.web.pagecomponents.navigationmenu.NavigationMenuComponent;

public class NavigationMenuPage {
	
	private NavigationMenuComponent navigationMenuComponent;
	
	public NavigationMenuPage() {
		this.navigationMenuComponent = new NavigationMenuComponent();
	}
	
	public NavigationMenuComponent getNavigationMenuComponent() {
		return navigationMenuComponent;
	}
	
	public void navigateToAdminPage() {
		navigationMenuComponent
			.clickMenuItem(MenuType.ADMIN);
	}

}
