package com.onboarding.service;

import java.util.List;

import com.onboarding.model.Applicant;

public interface ApplicantService {
	
	public Applicant saveApplicant(Applicant applicant);
	
	public Applicant updateApplicant(Applicant applicant);
	
	public List<Applicant> getAllApplicant();
	
	public Applicant getEmployee(int applicant_id);
	
	public void deleteApplicant(int applicant_id);

}
