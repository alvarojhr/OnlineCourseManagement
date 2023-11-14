package org.example;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private String instructorId;
    private String name;
    private List<Course> courses;

    public Instructor(String instructorId, String name) {
        this.instructorId = instructorId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Methods to manage courses
    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    // Getters and setters
    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    // Additional methods if necessary

    public Object getCourses(String i001) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

