package com.spring.course.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private long id; 
   private String title;
   private String description;




public Course() {
}


public Course(long id, String title, String description) {
    this.id = id;
    this.title = title;
    this.description = description;
}


public long getId() {
    return id;
}


public void setId(long id) {
    this.id = id;
}


public String getTitle() {
    return title;
}


public void setTitle(String title) {
    this.title = title;
}


public String getDescription() {
    return description;
}


public void setDescription(String description) {
    this.description = description;
}



   
   
}
