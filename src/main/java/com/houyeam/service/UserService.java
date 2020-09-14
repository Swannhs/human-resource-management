package com.houyeam.service;


import com.houyeam.model.User;
import com.houyeam.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}
