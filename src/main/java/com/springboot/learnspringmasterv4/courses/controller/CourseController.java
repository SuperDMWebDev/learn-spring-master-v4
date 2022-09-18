package com.springboot.learnspringmasterv4.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learnspringmasterv4.courses.bean.Course;

@RestController
public class CourseController {

	@GetMapping("/courses")
	public List<Course> getAllCourse()
	{
		return Arrays.asList(new Course(1,"Learn microservice","master-v4"));
	}
}
