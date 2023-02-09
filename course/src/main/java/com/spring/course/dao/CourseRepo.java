package com.spring.course.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.course.entities.Course;

public interface CourseRepo extends JpaRepository<Course,Long> {
    
}
