package com.sevanand.myprofileservice.entity.professional.project;

import org.springframework.stereotype.Component;

@Component
public class Skill {

	private TechnicalSkill techSkills;
	Skill(){}
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
