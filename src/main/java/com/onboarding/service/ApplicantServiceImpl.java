package com.onboarding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.onboarding.model.Applicant;
import com.onboarding.model.GenerateToken;
import com.onboarding.repository.LampApplicantRepository;

@Service
public class ApplicantServiceImpl implements ApplicantService{
	
	@Autowired
	LampApplicantRepository applicantRepository;
	
	@Autowired
	JavaMailSender javaMailSender;
	
	
	public Applicant register(Applicant applicant) {
		return applicantRepository.save(applicant);
	}
	
	
	
	public void sendmail(Applicant applicant) {
		GenerateToken gen=  new GenerateToken();
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(applicant.getEmail());
		message.setSubject("Email Testing");

		message.setText("Click on the link to confirm your account"+ " " +  "http://localhost:8080/changepassword?token="+gen.genToken());
		
		javaMailSender.send(message);
	}



	@Override
	public Applicant saveApplicant(Applicant applicant) {
		return applicantRepository.save(applicant);
	}



	@Override
	public Applicant updateApplicant(Applicant applicant) {
		return applicantRepository.saveAndFlush(applicant);
	}


	@Override
	public List<Applicant> getAllApplicant() {
		return applicantRepository.findAll();
	}


	@Override
	public Applicant getEmployee(int applicant_id) {
//		return applicantRepository.findOne(applicant_id);
		return null;
	}



	@Override
	public void deleteApplicant(int applicant_id) {
		applicantRepository.deleteById(applicant_id);
		
	}
}
