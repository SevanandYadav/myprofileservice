package com.sevanand.myprofileservice.entity.acedemics;

import java.util.Date;

public class AcademicsDetails {
	private String educationLevel;
	private String educationInstitute;
	private Date fromDate;
	private Date toDate;
	private int resultPercentage;

	public AcademicsDetails(String educationLevel, String educationInstitute, Date fromDate, Date toDate,
			int resultPercentage) {
		super();
		this.educationLevel = educationLevel;
		this.educationInstitute = educationInstitute;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.resultPercentage = resultPercentage;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getEducationInstitute() {
		return educationInstitute;
	}

	public void setEducationInstitute(String educationInstitute) {
		this.educationInstitute = educationInstitute;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public int getResultPercentage() {
		return resultPercentage;
	}

	public void setResultPercentage(int resultPercentage) {
		this.resultPercentage = resultPercentage;
	}

}
