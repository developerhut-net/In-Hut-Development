package com.developerhut.user;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.developerhut.user.model.User;
import com.developerhut.user.repos.UserRepository;

@SpringBootTest
class SpringCrudDemoApplicationTests {

	@Autowired
	private UserRepository repository;
	
	@Test
	void testAddUser() {
		User user = new User();
		user.setLoginId("james");
		user.setName("James");
		user.setStatus("ACTIVE");
		user.setExpiryDate(LocalDate.now());
		repository.save(user);
	}

	@Test
	void testFindById() {
		User user = repository.findById(1).get();
		System.out.println(user);
	}
	
	@Test
	void testUpdateUser() {
		User user = repository.findById(1).get();
		user.setStatus("INACTIVE");
		repository.save(user);
		System.out.println(user);		
	}
	
	@Test
	void testDeleteUser() {
		User user = repository.findById(1).get();
		user.setStatus("INACTIVE");
		repository.delete(user);
	}
	
}
