package com.ps.pages.web.pagecomponents.dashboardpage;

import static com.ps.utils.PageActionsHelper.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardHeaderComponent {
	
	private static final By HEADER = By.xpath("//h6");
	
	public String getHeaderString() {
		return getAttribute(HEADER, WebElement::getText);
	}

}
