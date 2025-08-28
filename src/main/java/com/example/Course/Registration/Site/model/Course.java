package com.example.Course.Registration.Site.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
@Entity
@Table(name = "course")
public class Course {
    @Id
    @Column(name = "courseId")
    private String courseId;
    @Column(name = "courseName")
    private String courseName;
    @Column(name = "trainer")
    private String trainer;
    @Column(name = "durationInWeeks")
    private int durationInWeeks;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }
}
