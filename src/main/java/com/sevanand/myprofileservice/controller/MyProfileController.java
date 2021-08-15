package com.sevanand.myprofileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sevanand.myprofileservice.entity.Profile;
import com.sevanand.myprofileservice.entity.common.BasicDetails;
import com.sevanand.myprofileservice.service.MyProfileService;

@RestController
public class MyProfileController {
//TODO:remove new and replace it with Autowired
	//@Autowired
	private MyProfileService myProfileService;

	@GetMapping("/portfolio")
	public Profile getProfile() {
		return new MyProfileService().getProfile();

	}

	@PostMapping("/portfolio/experience")
	public String addExperinece() {
		return "jdon Data";
	}

	@DeleteMapping("/portfolio/something")
	public String deleteHobby() {
		return "jdon Data";
	}

	@PutMapping("/portfolio/users")
	public String updateHobbies() {
		return "jdon Data hobbies";
	}
}
