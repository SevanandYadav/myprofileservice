package com.sevanand.myprofileservice.entity.common;

import java.util.HashMap;

import org.springframework.stereotype.Component;

/**
 * @author arsenal {@summary} Details for hobbies
 */
@Component
public class Hobbies {
	private HashMap<String, HobbyDetails> hobbies;
	Hobbies(){}
	public Hobbies(HashMap<String, HobbyDetails> hobbies) {
		super();
		this.hobbies = hobbies;
	}

	public HashMap<String, HobbyDetails> getHobbies() {
		return hobbies;
	}

	public void setHobbies(HashMap<String, HobbyDetails> hobbies) {
		this.hobbies = hobbies;
	}

}
