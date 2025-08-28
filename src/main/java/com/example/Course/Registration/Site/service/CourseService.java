package com.example.Course.Registration.Site.service;

import com.example.Course.Registration.Site.model.Course;
import com.example.Course.Registration.Site.model.CourseRegistry;
import com.example.Course.Registration.Site.repository.CourseRegistryRepo;
import com.example.Course.Registration.Site.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;


    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }


    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }


    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name, emailId, courseName);
        courseRegistryRepo.save(courseRegistry);
    }


    public void addCourse(String courseId, String courseName, String trainer, int durationInWeeks) {
        Course course = new Course();
        course.setCourseId(courseId);
        course.setCourseName(courseName);
        course.setTrainer(trainer);
        course.setDurationInWeeks(durationInWeeks);

        courseRepo.save(course);
    }
}
