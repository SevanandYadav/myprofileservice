package com.sevanand.myprofileservice.entity.acedemics;

import java.util.List;

public class Academics {
	private List<AcademicsDetails> academicDetails;

	public Academics(List<AcademicsDetails> academicDetails) {
		super();
		this.academicDetails = academicDetails;
	}

	public List<AcademicsDetails> getAcademicDetails() {
		return academicDetails;
	}

	public void setAcademicDetails(List<AcademicsDetails> academicDetails) {
		this.academicDetails = academicDetails;
	}

}
