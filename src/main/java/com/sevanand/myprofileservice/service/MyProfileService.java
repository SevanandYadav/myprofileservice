package com.sevanand.myprofileservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sevanand.myprofileservice.dao.MyProfileDao;
import com.sevanand.myprofileservice.entity.Profile;

@Service
public class MyProfileService {
	@Autowired
	private MyProfileDao dao;

	public Profile getProfile() {

		return dao.getProfileDetails();
	}
}
