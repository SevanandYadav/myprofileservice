package com.sevanand.myprofileservice.entity.common;

import java.util.HashMap;

/**
 * @author arsenal {@summary} Detiails contains specific details of hobby e.g if
 *         hobby is book which all books read and few line of descriptions
 */
public class HobbyDetails {
	private HashMap<String, String> hobbiesDetails;

	public HobbyDetails(HashMap<String, String> hobbiesDetails) {
		super();
		this.hobbiesDetails = hobbiesDetails;
	}

	public HashMap<String, String> getHobbiesDetails() {
		return hobbiesDetails;
	}

	public void setHobbiesDetails(HashMap<String, String> hobbiesDetails) {
		this.hobbiesDetails = hobbiesDetails;
	}

}
