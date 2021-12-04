package com.sevanand.myprofileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sevanand.myprofileservice.entity.common.BasicDetails;
import com.sevanand.myprofileservice.service.MyProfileService;

@Controller
public class MyProfileViewController {

	@Autowired
	private MyProfileService myProfileService;

	@GetMapping("/portfolios")
	public String getProfile(Model model) {
		// return new MyProfileService().getProfile();
		BasicDetails basicDetails=myProfileService.getProfile().getBasicDetails();

		model.addAttribute("message", basicDetails);
		return "indexPage";

	}

}
