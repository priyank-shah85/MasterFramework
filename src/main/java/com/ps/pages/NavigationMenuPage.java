package com.ps.pages;

import com.ps.pages.enums.navigationmenucomponent.MenuType;
import com.ps.pages.pagecomponents.navigationmenu.NavigationMenuComponent;

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
