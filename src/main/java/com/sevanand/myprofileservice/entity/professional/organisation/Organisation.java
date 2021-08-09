package com.sevanand.myprofileservice.entity.professional.organisation;

import java.util.List;

import com.sevanand.myprofileservice.entity.professional.project.Project;

public class Organisation {
private String orgName;
private String orgType;
private List<Project> projects;
public Organisation(String orgName, String orgType, List<Project> projects) {
	super();
	this.orgName = orgName;
	this.orgType = orgType;
	this.projects = projects;
}

}
