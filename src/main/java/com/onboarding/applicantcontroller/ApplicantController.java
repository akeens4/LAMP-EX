package com.onboarding.applicantcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onboarding.model.Applicant;
import com.onboarding.service.ApplicantService;

import org.springframework.mail.javamail.JavaMailSender;

@RequestMapping("applicant")
@RestController
public class ApplicantController {
	
	@Autowired
	private ApplicantService applicantService;
	
	@Autowired
	JavaMailSender javaMailSender;
	
	
	@PostMapping("/save")
	public Applicant save(@RequestBody Applicant applicant) {
		
		return applicantService.saveApplicant(applicant);
	}
	
	@PutMapping("/update")
	public Applicant update(@RequestBody Applicant applicant) {
		
		return applicantService.updateApplicant(applicant);
	}
	
	@GetMapping("/all")
	public List<Applicant> getAllEmployee() {
		
		return applicantService.getAllApplicant();
	}
	
	
	@GetMapping("/by/{applicant_id}")
	public Applicant getApplicant(@PathVariable(name ="applicant_id") int applicant_id) {
		
		return applicantService.getEmployee(applicant_id);
	}
	
	
	@DeleteMapping("/delete/applicant_id")
	public void deleteApplicant(@PathVariable(name ="applicant_id") int applicant_id) {
		
		applicantService.deleteApplicant(applicant_id);
	}
}