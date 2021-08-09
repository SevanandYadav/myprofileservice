package com.sevanand.myprofileservice.entity.professional.project;

import java.util.HashMap;

public class TechnicalSkill {
	HashMap<String, String> coreLanguageUtilization;
	HashMap<String, String> frameworkUtilization;

	public TechnicalSkill(HashMap<String, String> coreLanguageUtilization,
			HashMap<String, String> frameworkUtilization) {
		super();
		this.coreLanguageUtilization = coreLanguageUtilization;
		this.frameworkUtilization = frameworkUtilization;
	}

}
