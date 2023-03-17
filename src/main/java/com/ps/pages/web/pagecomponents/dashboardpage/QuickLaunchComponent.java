package com.ps.pages.web.pagecomponents.dashboardpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.ps.utils.PageActionsHelper.*;

public class QuickLaunchComponent {
	
	private static final By QUICK_LAUNCH_LINK = By.xpath("//button[@title='Timesheets']");
	
	public boolean isQuickLaunchLinkPresent() {
		return isPresent(QUICK_LAUNCH_LINK, WebElement::isDisplayed);
	}

}
