package com.developerhut.user.service;

import java.util.List;

import com.developerhut.user.model.User;

public interface UserService {

	User add(User user);
	
	User update(User user);
	
	void delete(Integer id);
	
	User findById(Integer id);
	
	List<User> getAll();
	
}
