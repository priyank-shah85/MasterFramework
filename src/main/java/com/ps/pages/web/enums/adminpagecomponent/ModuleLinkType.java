package com.ps.pages.web.enums.adminpagecomponent;

public enum ModuleLinkType {
	
	USERS("Users");
	
	private final String name;

	public String getName() {
		return name;
	}
	
	ModuleLinkType(String name) {
		this.name = name;
	}

}
