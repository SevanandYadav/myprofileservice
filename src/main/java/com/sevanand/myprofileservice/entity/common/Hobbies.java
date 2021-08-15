package com.sevanand.myprofileservice.entity.common;

import java.util.HashMap;

/**
 * @author arsenal {@summary} Details for hobbies
 */
public class Hobbies {
	private HashMap<String, HobbyDetails> hobbies;

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
