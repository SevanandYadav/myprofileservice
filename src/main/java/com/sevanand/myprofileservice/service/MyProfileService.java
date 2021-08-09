package com.sevanand.myprofileservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sevanand.myprofileservice.dao.MyProfileDao;
import com.sevanand.myprofileservice.entity.common.BasicDetails;

@Service
public class MyProfileService {
	@Autowired
	private MyProfileDao dao;

	public BasicDetails getProfile() {
		return dao.getProfileDetails();
	}
}
