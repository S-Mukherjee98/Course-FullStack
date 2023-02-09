package com.spring.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.course.entities.Course;
import com.spring.course.services.CourseServices;

@RestController
public class CourseController {
    @Autowired
    private CourseServices courseServices;

    @GetMapping("/courses")
    public List<Course> getCourses(){
        
        return this.courseServices.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseServices.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseServices.addCourse(course);
    }

    @PutMapping("/courses")
    
    public Course updateCourse(@RequestBody Course course){

        return this.courseServices.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public void deleteCourse(@PathVariable String courseId){
        this.courseServices.deleteCourse(Long.parseLong(courseId));
    }
}
