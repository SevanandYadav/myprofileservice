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

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public String getProjDesc() {
		return projDesc;
	}

	public void setProjDesc(String projDesc) {
		this.projDesc = projDesc;
	}

	public Skill getSkills() {
		return skills;
	}

	public void setSkills(Skill skills) {
		this.skills = skills;
	}

}
