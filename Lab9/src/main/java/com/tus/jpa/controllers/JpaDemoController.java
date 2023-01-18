package com.tus.jpa.controllers;

import com.tus.jpa.repositories.CourseRepository;
import com.tus.jpa.dto.Course;
import com.tus.jpa.dto.Module;
import com.tus.jpa.exceptions.ResourceNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaDemoController {
	 @Autowired
	 private CourseRepository courseRepository;
	
//	@GetMapping("/")
//	public String index() {
//		return "index";
//	}
	
	@GetMapping("/courses")
	List<Course> getCourses() {
		return courseRepository.findAll();
	}
	
	@GetMapping("/courses/{id}")
	public ResponseEntity<Course> getCourseById(@PathVariable(value = "id") Long courseId) throws ResourceNotFoundException {
		Optional<Course> course = courseRepository.findById(courseId);
		if (course.isPresent()) {
			return ResponseEntity.ok().body(course.get());
		} else {
			throw new ResourceNotFoundException("Course not found: " + courseId);
		}
	}
	
	 @PostMapping("/courses")
	 public Course createCourse(@RequestBody Course course) {
		return courseRepository.save(course);
	 }
	 
	 @DeleteMapping("/courses/{id}")
	 public void deleteCourse(@PathVariable(value="id") Long courseId) {
		 courseRepository.deleteById(courseId);
	 }
	 
	 @GetMapping("/dummy")
	 public Course createDummy() {
		 Module m1 = new Module("Engineering in Society", 10);
		 Module m2 = new Module("Advanced Databases", 12);
		 List<Module> courseModules = new ArrayList<>();
		 courseModules.add(m1);
		 courseModules.add(m2);
		 Course course = new Course("Part Time MASE", "IT");
		 course.setModules(courseModules);
		 return courseRepository.save(course);
	 }
	 
}
