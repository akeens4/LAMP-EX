package com.onboarding.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.onboarding.model.Applicant;

public interface LampApplicantRepository extends CrudRepository<Applicant, Integer>{
	
	List<String> findByEmail(String email);
}

