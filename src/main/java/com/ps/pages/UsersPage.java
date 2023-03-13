package com.ps.pages;

import com.ps.pages.pagecomponents.adminpage.SearchComponent;
import com.ps.pages.pagecomponents.adminpage.UserListComponent;

public class UsersPage {
	
	private final SearchComponent searchComponent;
	private final UserListComponent userListComponent;
	
	public UsersPage() {
		this.userListComponent = new UserListComponent();
		this.searchComponent = new SearchComponent();
	}
	
	public UserListComponent getUserListComponent() {
		return userListComponent;
	}

	public SearchComponent getSearchComponent() {
		return searchComponent;
	}

}
