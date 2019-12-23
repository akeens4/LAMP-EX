package com.onboarding.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Applicant {

	@Id
	@GeneratedValue
	private int applicant_id;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_number")
	private Long phone_number;
	
	@Column(name="password")
	private String password;
	
	public int getApplicant_id() {
		return applicant_id;
	}
	public void setApplicant_id(int applicant_id) {
		this.applicant_id = applicant_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(Long phone_number) {
		this.phone_number = phone_number;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Applicant [applicant_id=" + applicant_id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", phone_number=" + phone_number + ", password=" + password + "]";
	}

	
	
	
	
}

