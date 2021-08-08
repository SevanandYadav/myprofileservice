package com.sevanand.myprofileservice.entity;

import java.sql.Date;

/**
 * @author arsenal
 * {@summary}@ Basic Detail for portfolio,which gives the identity
 *
 */
public class BasicDetails {
	private String firstName;
	private String lastName;
	private Date dob;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "BasicDetails [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
	}
	

}
