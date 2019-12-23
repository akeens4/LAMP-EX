package com.onboarding.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onboarding.model.Applicant;

import com.onboarding.serviice.ApplicantService;


import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;

@Controller
public class OnboardingController {
	
	private static final Logger logger = LoggerFactory.getLogger(OnboardingController.class);

	@Autowired
	ApplicantService applicantService;
	
	@Autowired
	JavaMailSender javaMailSender;
	
	@RequestMapping("/changepassword")
	public String changePassword() {
		
		return "changepassword";
	}
	
	@RequestMapping("/landing")
	public String goToLanding() {
		
		return "landing";
	}
	
	@RequestMapping("/home")
	public String register() {
		
		return "register";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String sendmail(Applicant applicant)
	{
		String returnPath = "eConfirm";
		applicant = applicantService.register(applicant);
		if(applicant.getApplicant_id() <= 0) {
			logger.error(applicant.toString() + "not successfully created");
			returnPath = "";
		} else {
			applicantService.sendmail(applicant);
		}
		
		return returnPath;
	}
}
