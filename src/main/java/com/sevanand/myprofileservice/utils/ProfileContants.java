package com.sevanand.myprofileservice.utils;

public enum ProfileContants {
	ORG_TYPE_SERVICE("SERVICE-BASED"), ORG_TYPE_PROD("PRODUCT-BASED");

	private String profileConstant;

	// enum constructor - cannot be public or protected
	private ProfileContants(String profileConstant) {
		this.profileConstant = profileConstant;
	}

	// getter method
	public String getProfileConstant() {
		return this.profileConstant;
	}
}
