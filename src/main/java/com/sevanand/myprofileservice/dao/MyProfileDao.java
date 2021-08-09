package com.sevanand.myprofileservice.dao;



import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sevanand.myprofileservice.entity.common.BasicDetails;

@Repository
public class MyProfileDao {

	private static BasicDetails basicDetails = new BasicDetails("Sevanand", "Yadav", new Date(1994, 01, 18));

	public BasicDetails getProfileDetails() {
		return basicDetails;

	}

}
