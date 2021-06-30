package com.haruo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haruo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
