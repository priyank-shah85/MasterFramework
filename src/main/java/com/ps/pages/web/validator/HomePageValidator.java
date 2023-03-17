package com.ps.pages.web.validator;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class HomePageValidator {
	
	private String headerName;
	private boolean isTimesheetsLinkPresent;
	private String logoSourceText;

}
