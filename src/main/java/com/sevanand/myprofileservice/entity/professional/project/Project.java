package com.sevanand.myprofileservice.entity.professional.project;

public class Project {
	private String projName;
	private String projDesc;
	private Skill skills;

	public Project(String projName, String projDesc, Skill skills) {
		super();
		this.projName = projName;
		this.projDesc = projDesc;
		this.skills = skills;
	}

}
