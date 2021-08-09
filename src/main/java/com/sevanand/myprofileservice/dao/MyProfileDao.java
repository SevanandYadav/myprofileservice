package com.sevanand.myprofileservice.dao;

import org.springframework.stereotype.Component;

import com.sevanand.myprofileservice.entity.Profile;

@Component
public class MyProfileDao {

	

	public Profile getProfileDetails() {
		 return new Profile();

	}

}
