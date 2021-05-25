package com.pavan.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pavan.frontend.dao.UserRepository;
import com.pavan.frontend.model.User;

@SpringBootApplication
public class UserBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UserBackendApplication.class, args);
	}

	@Autowired
	UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepo.save(new User("sai",  "sandeep", "cse", "sai@gmail.com"));
		userRepo.save(new User("shaik",  "ali", "cse", "ali@gmail.com"));
		userRepo.save(new User("antony",  "paul", "cse", "paul@gmail.com"));
		userRepo.save(new User("ravi",  "shankar", "cse", "ravi@gmail.com"));
		userRepo.save(new User("kavya",  "sri", "cse", "sri@gmail.com"));
		userRepo.save(new User("pavan",  "kalyan", "cse", "kalyan@gmail.com"));
		
	}

}
