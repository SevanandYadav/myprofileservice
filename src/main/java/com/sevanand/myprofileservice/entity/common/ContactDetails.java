package com.sevanand.myprofileservice.entity.common;

import java.util.HashMap;

public class ContactDetails {
	private String mobileNumber;
	private String emailId;
	private String linkedinHandle;
	private HashMap<String, String> programmingPlatformHandles;
	//TODO: setter can be removed
	
	public ContactDetails(String mobileNumber, String emailId, String linkedinHandle,
			HashMap<String, String> programmingPlatformHandles) {
		super();
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.linkedinHandle = linkedinHandle;
		this.programmingPlatformHandles = programmingPlatformHandles;
	}

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

	@Override
	public String toString() {
		return "ContactDetails [mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", linkedinHandle="
				+ linkedinHandle + ", programmingPlatformHandles=" + programmingPlatformHandles + "]";
	}

}
