package com.ps.pages.enums.addusercomponent;

public enum StatusType {
	
	ENABLED("Enabled"),
	DISABLED("Disabled");
	
	private final String name;

	public String getName() {
		return name;
	}
	
	StatusType(String name) {
		this.name = name;
	}

}
