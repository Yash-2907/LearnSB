package com.learnSpringBoot.learn_jpa_and_hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcCommandLineRunner implements CommandLineRunner{
	@Autowired
	private jdbcRepo objJdbcRepo;

	@Override
	public void run(String... args) throws Exception {
		objJdbcRepo.insertVal(new Course(1,"learn aws","in28mins"));
		objJdbcRepo.insertVal(new Course(2,"learn azure","in28mins"));
		objJdbcRepo.insertVal(new Course(3,"learn cloud","in28mins"));
		objJdbcRepo.deleteRow(2);
		System.out.println(objJdbcRepo.findbyid(3));
	}
}
