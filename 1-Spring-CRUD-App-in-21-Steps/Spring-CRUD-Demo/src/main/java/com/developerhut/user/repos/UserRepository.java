package com.developerhut.user.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developerhut.user.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
