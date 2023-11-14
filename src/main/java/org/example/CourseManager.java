package org.example;

import java.util.List;

public class CourseManager {
    private CourseDatabase database;

    public CourseManager(CourseDatabase database) {
        this.database = database;
    }

    public boolean createCourse(Course course) {
        if (course == null || course.getCourseId("null") == null || course.getTitle() == null) {
            return false;
        }
        database.saveCourse(course);
        return true;
    }

    public boolean deleteCourse(String courseId) {
        if (courseId == null || database.getCourseById(courseId) == null) {
            return false;
        }
        database.deleteCourse(courseId);
        return true;
    }

    public Course getCourseById(String courseId) {
        if (courseId == null) {
            return null;
        }
        return database.getCourseById(courseId);
    }

    public List<Course> getCoursesByInstructor(String instructorId) {
        if (instructorId == null) {
            return null;
        }
        return database.getCoursesByInstructorId(instructorId);
    }

    // Additional methods as needed
}

