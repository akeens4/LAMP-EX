package com.onboarding.service;

import org.springframework.data.repository.CrudRepository;

import com.onboarding.model.Admin;

public interface LampRepositoryAdmin  extends CrudRepository<Admin, Integer>{
	
}
