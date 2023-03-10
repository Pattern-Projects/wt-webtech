package com.tus.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tus.jpa.dto.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
	
}
