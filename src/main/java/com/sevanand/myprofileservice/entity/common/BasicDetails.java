package com.sevanand.myprofileservice.entity.common;

import java.util.Date;

import org.springframework.stereotype.Service;

/**
 * @author arsenal {@summary}@ Basic Detail for portfolio,which gives the
 *         identity
 *
 */
@Service
public class BasicDetails {
	private String firstName;
	private String lastName;
	private Date dob;
	
	public BasicDetails(String firstName, String lastName, Date date) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = date;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "BasicDetails [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
	}

}
