package com.ps.pages.web.pagecomponents.navigationmenu;

import org.openqa.selenium.By;

import com.ps.pages.web.enums.navigationmenucomponent.MenuType;

import static com.ps.utils.PageActionsHelper.*;

public class NavigationMenuComponent {
	
	private static final String MENU = "//span[text()='%s']/parent::a";
	private static final By LOGO = By.xpath("//img[@alt='client brand banner']");
	
	public NavigationMenuComponent clickMenuItem(MenuType menuType) {
		String xpath = String.format(MENU, menuType.getName());
		waitAndClick(By.xpath(xpath));
		return this;
	}
	
	public String getLogoSourceString() {
		return getAttribute(LOGO, e -> e.getAttribute("src"));
	}
}
