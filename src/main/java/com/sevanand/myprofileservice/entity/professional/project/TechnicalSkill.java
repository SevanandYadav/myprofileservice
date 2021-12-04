package com.sevanand.myprofileservice.entity.professional.project;

import java.util.HashMap;

import org.springframework.stereotype.Component;
@Component
public class TechnicalSkill {
	HashMap<String, String> coreLanguageUtilization;
	HashMap<String, String> frameworkUtilization;
	
	TechnicalSkill(){}

	public TechnicalSkill(HashMap<String, String> coreLanguageUtilization,
			HashMap<String, String> frameworkUtilization) {
		super();
		this.coreLanguageUtilization = coreLanguageUtilization;
		this.frameworkUtilization = frameworkUtilization;
	}

	public HashMap<String, String> getCoreLanguageUtilization() {
		return coreLanguageUtilization;
	}

	public void setCoreLanguageUtilization(HashMap<String, String> coreLanguageUtilization) {
		this.coreLanguageUtilization = coreLanguageUtilization;
	}

	public HashMap<String, String> getFrameworkUtilization() {
		return frameworkUtilization;
	}

	public void setFrameworkUtilization(HashMap<String, String> frameworkUtilization) {
		this.frameworkUtilization = frameworkUtilization;
	}

}
