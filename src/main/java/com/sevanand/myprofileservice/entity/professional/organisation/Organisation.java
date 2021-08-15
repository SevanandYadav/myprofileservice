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
public String getOrgName() {
	return orgName;
}
public void setOrgName(String orgName) {
	this.orgName = orgName;
}
public String getOrgType() {
	return orgType;
}
public void setOrgType(String orgType) {
	this.orgType = orgType;
}
public List<Project> getProjects() {
	return projects;
}
public void setProjects(List<Project> projects) {
	this.projects = projects;
}

}
