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

}
