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

/**
 * @author arsenal
 * @summary Profile Class represents the portfolio, it uses builder-pattern to
 *          build different parts of portfolio
 * @problem faced - return a complex object [using autowired -which requires the
 *          default constructir
 */
@Service
public class Profile {
	private BasicDetails basicDetails;
	private ContactDetails contactDetails;
	private Hobbies myhobbies;
	private Academics acad;
	private ProfessionalDetails professionalDetails;

	public Profile(BasicDetails basicDetails, ContactDetails contactDetails, Hobbies myhobbies, Academics acad,
			ProfessionalDetails professionalDetails) {
		super();
		this.basicDetails = basicDetails;
		this.contactDetails = contactDetails;
		this.myhobbies = myhobbies;
		this.acad = acad;
		this.professionalDetails = professionalDetails;
	}

	public BasicDetails getBasicDetails() {
		return basicDetails;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public Hobbies getMyhobbies() {
		return myhobbies;
	}

	public Academics getAcad() {
		return acad;
	}

	public ProfessionalDetails getProfessionalDetails() {
		return professionalDetails;
	}

}
