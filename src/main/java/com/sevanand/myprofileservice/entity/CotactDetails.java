package com.sevanand.myprofileservice.entity;

import java.util.HashMap;

public class CotactDetails {
	private String mobileNumber;
	private String emailId;
	private String linkedinHandle;
	private HashMap<String, String> programmingPlatformHandles;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getLinkedinHandle() {
		return linkedinHandle;
	}

	public void setLinkedinHandle(String linkedinHandle) {
		this.linkedinHandle = linkedinHandle;
	}

	public HashMap<String, String> getProgrammingPlatformHandles() {
		return programmingPlatformHandles;
	}

	public void setProgrammingPlatformHandles(HashMap<String, String> programmingPlatformHandles) {
		this.programmingPlatformHandles = programmingPlatformHandles;
	}

}
