package com.developerhut.inhutdev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.developerhut.inhutdev.repository.UserRepository;

public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		System.out.println("Received login request from : " + username);
		com.developerhut.inhutdev.entity.User loggedInUser = UserRepository.userMap.get(username);
		
		if(loggedInUser == null) {
			return null;
		}
		
		UserDetails userDetails = User
				.builder()
				.username(loggedInUser.getUsername())
				.password(passwordEncoder.encode(loggedInUser.getPassword()))
				.roles(loggedInUser.getScreenPermission())
				.build();
		
		return userDetails;
	}

}
