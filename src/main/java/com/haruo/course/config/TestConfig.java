package com.haruo.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.haruo.course.entities.User;
import com.haruo.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "maria@gmail.com", "Maria Brown", "123456789", "123456");
		User u2 = new User(null, "alex@gmail.com", "Alex Green", "123456789", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
}
