package com.learnSpringBoot.learn_jpa_and_hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class jpaRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public void insertInTable(Course course) {
		entityManager.merge(course);
	}
	
	public Course findInTable(long id) {
		return entityManager.find(Course.class,id);
	}
	
	public void removeFromTable(long id) {
		var find =  entityManager.find(Course.class, id);
		entityManager.remove(find);
	}
}
