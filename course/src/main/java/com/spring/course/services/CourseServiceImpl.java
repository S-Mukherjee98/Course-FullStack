package com.spring.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.course.dao.CourseRepo;
import com.spring.course.entities.Course;

@Service
public class CourseServiceImpl  implements CourseServices{

    @Autowired
    private CourseRepo courseRepo;

    public CourseServiceImpl() {
    }

    @Override
    public List<Course> getCourses() {
        
        List<Course> li= courseRepo.findAll();
        return li;
    }

    @Override
    public Course getCourse(long courseId) {
        
        return courseRepo.getReferenceById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        courseRepo.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        
        courseRepo.save(course);
        return null;
    }

    @Override
    public void deleteCourse(long courseId) {
        Course entity= courseRepo.getReferenceById(courseId);
        courseRepo.delete(entity);
        
    }

   

    
    
}
