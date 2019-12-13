package com.onboarding.repository;

import org.springframework.data.repository.CrudRepository;

import com.onboarding.model.Admin;

public interface LampAdminRepository  extends CrudRepository<Admin, Integer>{
	
}
