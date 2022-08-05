package com.developerhut.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developerhut.user.model.User;
import com.developerhut.user.repos.UserRepository;
import com.developerhut.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;
		
	@Override
	public User add(User user) {
		return repository.save(user);
	}

	@Override
	public User update(User user) {
		return repository.save(user);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public User findById(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public List<User> getAll() {
		return repository.findAll();
	}

}
