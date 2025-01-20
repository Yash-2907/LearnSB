package com.learnSpringBoot.learn_jpa_and_hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private jpaRepository obJpaRepository;
	
	@Autowired
	private SpringDataJpaRepo obSpringDataJpaRepo;

	@Override
	public void run(String... args) throws Exception {
		obSpringDataJpaRepo.save(new Course(1,"learn aws datajpa","in28mins"));
		obSpringDataJpaRepo.save(new Course(2,"learn azure","in28mins"));
		obSpringDataJpaRepo.save(new Course(3,"learn cloud datajpa","in28mins"));
		obSpringDataJpaRepo.deleteById(2l);
		System.out.println(obSpringDataJpaRepo.findById(3l));
		System.out.println(obSpringDataJpaRepo.findByName("learn aws datajpa"));
		System.out.println(obSpringDataJpaRepo.findByName("learn azure"));
		System.out.println(obSpringDataJpaRepo.findByAuthor("in28mins"));
	}
}
