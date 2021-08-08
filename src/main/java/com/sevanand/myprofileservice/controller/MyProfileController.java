package com.sevanand.myprofileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sevanand.myprofileservice.service.MyProfileService;

@RestController
public class MyProfileController {
	@Autowired
	private MyProfileService service;
	@GetMapping("/portfolio")
	public String getProfile() {
		return Response
				.//ok().entity(Entity.json(result)).build();
		service.getProfile();
		return "jdon Data";
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
