package com.onboarding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.onboarding.model.Applicant;
import com.onboarding.model.GenerateToken;

import com.onboarding.service.LampRepositoryApplicant;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Controller
public class OnboardingController {

	@Autowired
	LampRepositoryApplicant lampRepository;
	
	@Autowired
	JavaMailSender javaMailSender;
	
//	@Autowired
//	ConfirmationToken confirmationToken;
//	
//	@Autowired
//	ConfirmationTokenRepository confirmationTokenRepository;
	@RequestMapping("/changepassword")
	public String changePassword() {
		
		return "changepassword";
	}
	
	@RequestMapping("/")
	public String register() {
		
		return "register";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
//	@RequestMapping("/register")
//	public String register() {
//		
//		System.out.println("Form not saved");
//		
//		System.out.println("Form saved");
//		return "eConfirm";
//	}
	
	@RequestMapping("/email")
	public String sendmail(Applicant applicant) {
		
		GenerateToken gen=  new GenerateToken();

		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("akinloluawoseemo@gmail.com");
		message.setSubject("Email Testing");

		message.setText("Click on the link to confirm your account"+ " " +  "http://localhost:8080/changepassword?token="+gen.genToken());

		
		javaMailSender.send(message);
		lampRepository.save(applicant);
		return "eConfirm";
		
	}
}
