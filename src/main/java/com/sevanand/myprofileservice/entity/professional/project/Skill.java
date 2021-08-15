package com.sevanand.myprofileservice.entity.professional.project;

public class Skill {

	private TechnicalSkill techSkills;

	public Skill(TechnicalSkill techSkills) {
		super();
		this.techSkills = techSkills;
	}

	public TechnicalSkill getTechSkills() {
		return techSkills;
	}

	public void setTechSkills(TechnicalSkill techSkills) {
		this.techSkills = techSkills;
	}

}
