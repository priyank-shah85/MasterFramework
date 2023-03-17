package com.ps.pages.web.pagecomponents.adminpage;

import org.openqa.selenium.By;

import com.ps.pages.web.enums.adminpagecomponent.ModuleLinkType;
import com.ps.pages.web.enums.adminpagecomponent.SubMenuType;
import com.ps.utils.PageActionsHelper;

public class SubMenuComponent {
	
	private static final String SUB_MENU = "//span[text()='%s']/parent::li";
	private static final String MODULE_LINK = "//a[text()='%s']";
	
	public SubMenuComponent clicSubkMenuItem(SubMenuType subMenuType) {
		String xpath = String.format(SUB_MENU, subMenuType.getName());
		PageActionsHelper.waitAndClick(By.xpath(xpath));
		return this;
	}
	
	public SubMenuComponent clicModuleLinkItem(ModuleLinkType moduleLinkType) {
		String xpath = String.format(MODULE_LINK, moduleLinkType.getName());
		PageActionsHelper.waitAndClick(By.xpath(xpath));
		return this;
	}

}
