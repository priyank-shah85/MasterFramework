package com.ps.pages;

import com.ps.pages.enums.adminpagecomponent.ModuleLinkType;
import com.ps.pages.enums.adminpagecomponent.SubMenuType;
import com.ps.pages.pagecomponents.adminpage.SubMenuComponent;

public class AdminPage {
	
	private SubMenuComponent subMenuComponent;
	
	public AdminPage() {
		this.subMenuComponent = new SubMenuComponent();
	}
	
	public SubMenuComponent getSubMenuComponent() {
		return subMenuComponent;
	}
	
	public UsersPage navigateToUsersPage() {
		subMenuComponent
			.clicSubkMenuItem(SubMenuType.USER_MANAGEMENT)
			.clicModuleLinkItem(ModuleLinkType.USERS);
		return new UsersPage();
	}

}
