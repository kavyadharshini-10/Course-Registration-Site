package com.example.Course.Registration.Site.repository;

import com.example.Course.Registration.Site.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,String> {
}