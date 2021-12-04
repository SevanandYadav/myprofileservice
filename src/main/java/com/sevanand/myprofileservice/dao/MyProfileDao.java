package com.sevanand.myprofileservice.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sevanand.myprofileservice.entity.Profile;
import com.sevanand.myprofileservice.entity.acedemics.Academics;
import com.sevanand.myprofileservice.entity.acedemics.AcademicsDetails;
import com.sevanand.myprofileservice.entity.common.BasicDetails;
import com.sevanand.myprofileservice.entity.common.ContactDetails;
import com.sevanand.myprofileservice.entity.common.Hobbies;
import com.sevanand.myprofileservice.entity.common.HobbyDetails;
import com.sevanand.myprofileservice.entity.professional.ProfessionalDetails;
import com.sevanand.myprofileservice.entity.professional.organisation.Organisation;
import com.sevanand.myprofileservice.entity.professional.project.Project;
import com.sevanand.myprofileservice.entity.professional.project.Skill;
import com.sevanand.myprofileservice.entity.professional.project.TechnicalSkill;
import com.sevanand.myprofileservice.utils.ProfileContants;

@Component
public class MyProfileDao {

	private Profile profileResult;
	private HashMap<String, String> programmingPlatformMap = new HashMap<String, String>();
	private HashMap<String, HobbyDetails> hobbies=new HashMap<String, HobbyDetails>();
	private HashMap<String, String> hobbiesDetails=new HashMap<String, String>();
	private List<AcademicsDetails> academicsDetails=new ArrayList<AcademicsDetails>();
	private HashMap<String, String> coreLanguageUtilization=new HashMap<String, String>();
	private HashMap<String, String> frameworkUtilization=new HashMap<String, String>();
	//private TechnicalSkill techSkills=new TechnicalSkill();
	private Skill skills;
	private List<Project> projects=new ArrayList<Project>();
	private Organisation organisation;
	private HashMap<Integer, Organisation> workExperience=new HashMap<Integer, Organisation>();
	String fName = "Sevanand";

	private void populateData() {
		
		programmingPlatformMap.put("github", "something.github.com");
		hobbiesDetails.put("7 Habits of highly effective people", "Author:Steven carvey");
		hobbiesDetails.put("God Of Small Things", "Author:Arundhati Roy");
		hobbies.put("Reading Books", new HobbyDetails(hobbiesDetails));
		academicsDetails.add(new AcademicsDetails("10th", "APS", new Date(2009, 05, 18), new Date(2010, 05, 18), 80));

		coreLanguageUtilization.put("Java-8", "Component");
		coreLanguageUtilization.put("React", "My-Profile");
		coreLanguageUtilization.put("AWS", "My-Profile");
		frameworkUtilization.put("Springboot", "PetProject");
		skills = new Skill(new TechnicalSkill(coreLanguageUtilization, frameworkUtilization));
		projects.add(new Project("Live Sttreaming", "Deleveing Videos live", skills));
		organisation = new Organisation("Cybage", String.valueOf(ProfileContants.ORG_TYPE_SERVICE), projects);
		workExperience.put(1, organisation);

	

	}

	public Profile getProfileDetails() {
		populateData();
		BasicDetails basicDetails = new BasicDetails(fName, "Yadav", new Date(1994, 01, 18));
		// TODO: it can be buider pattern
		ContactDetails contactDetails = new ContactDetails("9140153684", "sevanandyadav@gmail.com",
				"https://linkedin.com/in/sevanand-yadav", programmingPlatformMap);
		Hobbies myhobbies = new Hobbies(hobbies);
		Academics acad = new Academics(academicsDetails);
		ProfessionalDetails professionalDetails = new ProfessionalDetails(4, workExperience);
		
		return new Profile(basicDetails, contactDetails, myhobbies, acad, professionalDetails);

	}

}
