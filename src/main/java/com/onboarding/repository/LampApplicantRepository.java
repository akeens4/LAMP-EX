package com.onboarding.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onboarding.model.Applicant;

@Repository
public interface LampApplicantRepository extends JpaRepository<Applicant, Integer>{
	
//	List<String> findByEmail(String email);
}

