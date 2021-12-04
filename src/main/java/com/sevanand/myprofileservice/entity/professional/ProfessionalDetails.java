package com.sevanand.myprofileservice.entity.professional;

import java.time.Duration;
import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.sevanand.myprofileservice.entity.professional.organisation.Organisation;
@Component
public class ProfessionalDetails {
	private int totalExperience;
	private HashMap<Integer, Organisation> workExperience;
	
	ProfessionalDetails(){}

	public ProfessionalDetails(int totalExperience, HashMap<Integer, Organisation> workExperience) {
		super();
		this.totalExperience = totalExperience;
		this.workExperience = workExperience;
	}

	public int getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}

	public HashMap<Integer, Organisation> getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(HashMap<Integer, Organisation> workExperience) {
		this.workExperience = workExperience;
	}

}
