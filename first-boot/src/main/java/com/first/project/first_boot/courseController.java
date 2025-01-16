package com.first.project.first_boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class courseController {

	@RequestMapping("/courses")
	public List<Course> getCourses(){
		List<Course> currlist = new ArrayList<>(Arrays.asList(
			    new Course(1, "AWS", "in28mins"),
			    new Course(2, "devops", "in28mins"),
			    new Course(3, "azure", "in28mins")
			));
		return currlist;
	}
}
