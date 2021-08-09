package com.sevanand.myprofileservice.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.time.Duration;

import org.springframework.stereotype.Service;

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

@Service
public class Profile {
	//SOmehow return the Object even if build by buidler check how to retrun
	private static Profile profileResult;
	static private HashMap<String, String> programmingPlatformMap = new HashMap<String, String>();
	static private HashMap<String, HobbyDetails> hobbies;
	static private HashMap<String, String> hobbiesDetails;
	static private List<AcademicsDetails> academicsDetails;
	static private HashMap<String, String> coreLanguageUtilization;
	static private HashMap<String, String> frameworkUtilization;
	private TechnicalSkill techSkills;
	private Skill skills;
	static private List<Project> projects;
	static private Organisation organisation;
	static private HashMap<Integer, Organisation> workExperience;
	String fName="Sevanand";
	

	static {
		programmingPlatformMap.put("github", "something.github.com");
		hobbiesDetails.put("7 Habits of highly effective people", "Author:Steven carvey");
		hobbiesDetails.put("God Of Small Things", "Author:Arundhati Roy");
		hobbies.put("Reading Books", new HobbyDetails(hobbiesDetails));
		academicsDetails.add(new AcademicsDetails("10th", "APS", new Date(2009, 05, 18), new Date(2010, 05, 18), 80));
		
		coreLanguageUtilization.put("Java-8", "Component");
		coreLanguageUtilization.put("React", "My-Profile");
		coreLanguageUtilization.put("AWS", "My-Profile");
		frameworkUtilization.put("Springboot", "PetProject");
		Skill skills = new Skill(new TechnicalSkill(coreLanguageUtilization, frameworkUtilization));
		projects.add(new Project("Live Sttreaming", "Deleveing Videos live", skills));
		organisation = new Organisation("Cybage", String.valueOf(ProfileContants.ORG_TYPE_SERVICE), projects);
		workExperience.put(1, organisation);

	}

	private BasicDetails basicDetails = new BasicDetails(fName, "Yadav", new Date(1994, 01, 18));
	// TODO: it can be buider pattern
	private ContactDetails contactDetails = new ContactDetails("9140153684", "sevanandyadav@gmail.com",
			"https://linkedin.com/in/sevanand-yadav", programmingPlatformMap);
	private Hobbies myhobbies = new Hobbies(hobbies);
	private Academics acad = new Academics(academicsDetails);
	private  ProfessionalDetails professionalDetails = new ProfessionalDetails(4,workExperience);
	
	public Profile(BasicDetails basicDetails, ContactDetails contactDetails, Hobbies myhobbies, Academics acad,
			ProfessionalDetails professionalDetails) {
		super();
		profileResult.basicDetails = basicDetails;
		profileResult.contactDetails = contactDetails;
		profileResult.myhobbies = myhobbies;
		profileResult.acad = acad;
		profileResult.professionalDetails = professionalDetails;
	}

	

	public  static Profile getProfile() {
		return profileResult;

	}

}
