package com.ps.pages.enums.navigationmenucomponent;

public enum MenuType {

	ADMIN("Admin"),
	PIM ("PIM"),
	LEAVE("Leave"),
	TIME("Time");

	private final String name;

	public String getName() {
		return name;
	}
	
	MenuType(String name) {
		this.name = name;
	}
	
	
}
