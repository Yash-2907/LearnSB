package com.learnSpringBoot.learn_jpa_and_hibernate;

import java.lang.reflect.Constructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	 @Id
     private long id;
     private String name;
     private String author;
     
    public Course() {
    	
    }
    
	public Course(int id, String coursenameString, String authorString) {
		super();
		this.id = id;
		this.name = coursenameString;
		this.author = authorString;
	}
	public long getId() {
		return id;
	}
	public String getCoursenameString() {
		return name;
	}
	public String getAuthorString() {
		return author;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}
