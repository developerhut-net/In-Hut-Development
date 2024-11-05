package com.developerhut.inhutdev.repository;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Configuration;

import com.developerhut.inhutdev.entity.User;

import jakarta.annotation.PostConstruct;

@Configuration
public class UserRepository {

	public static Map<String, User> userMap = new HashMap<>();
	
	@PostConstruct
	public void createUsers() {
		
		User user1 = new User("john", "password", "ADMIN", "John", "Doe", LocalDateTime.now().toString());
		User user2 = new User("jessica", "password", "USER", "Jessica", "Thompson", LocalDateTime.now().toString());
		
		userMap.put(user1.getUsername(), user1);
		userMap.put(user2.getUsername(), user2);
		
	}
	
}
