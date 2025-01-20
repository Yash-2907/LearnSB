package com.learnSpringBoot.learn_jpa_and_hibernate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaRepo extends JpaRepository<Course, Long >{
	
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
