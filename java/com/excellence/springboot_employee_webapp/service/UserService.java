package com.excellence.springboot_employee_webapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.excellence.springboot_employee_webapp.dto.UserRegistrationDto;
import com.excellence.springboot_employee_webapp.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
