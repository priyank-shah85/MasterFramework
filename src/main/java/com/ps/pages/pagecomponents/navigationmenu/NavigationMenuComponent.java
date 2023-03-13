package com.ps.pages.pagecomponents.navigationmenu;

import org.openqa.selenium.By;

import com.ps.pages.enums.navigationmenucomponent.MenuType;
import com.ps.utils.PageActionsHelper;

public class NavigationMenuComponent {
	
	private static final String MENU = "//span[text()='%s']/parent::a";
	
	public NavigationMenuComponent clickMenuItem(MenuType menuType) {
		String xpath = String.format(MENU, menuType.getName());
		PageActionsHelper.waitAndClick(By.xpath(xpath));
		return this;
	}
}
