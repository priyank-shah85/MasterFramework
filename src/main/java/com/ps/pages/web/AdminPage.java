package com.ps.pages.web;

import com.ps.pages.web.enums.adminpagecomponent.ModuleLinkType;
import com.ps.pages.web.enums.adminpagecomponent.SubMenuType;
import com.ps.pages.web.pagecomponents.adminpage.SubMenuComponent;
import com.ps.pages.web.pagecomponents.dashboardpage.DashboardHeaderComponent;
import com.ps.pages.web.pagecomponents.dashboardpage.QuickLaunchComponent;
import com.ps.pages.web.pagecomponents.navigationmenu.NavigationMenuComponent;
import com.ps.pages.web.validator.HomePageValidator;

public class AdminPage {
	
	private SubMenuComponent subMenuComponent;
	private NavigationMenuComponent navigationMenuComponent;
	private DashboardHeaderComponent dashboardHeaderComponent;
	private QuickLaunchComponent quickLaunchComponent;
	
	public AdminPage() {
		this.subMenuComponent = new SubMenuComponent();
		this.navigationMenuComponent = new NavigationMenuComponent();
		this.dashboardHeaderComponent = new DashboardHeaderComponent();
		this.quickLaunchComponent = new QuickLaunchComponent();
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
	
	public HomePageValidator getHomePageValidator() {
		return HomePageValidator.builder()
				.logoSourceText(navigationMenuComponent.getLogoSourceString())
				.headerName(dashboardHeaderComponent.getHeaderString())
				.isTimesheetsLinkPresent(quickLaunchComponent.isQuickLaunchLinkPresent())
				.build();
	}

}
