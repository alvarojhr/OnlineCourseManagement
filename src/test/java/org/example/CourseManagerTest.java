/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.example;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BELLTA
 */
public class CourseManagerTest {
    
    public CourseManagerTest() {
    }

    @Test
    public void testCreateCourse() {
        System.out.println("createCourse");
        Course course = null;
        CourseManager instance = null;
        boolean expResult = false;
        boolean result = instance.createCourse(course);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeleteCourse() {
        System.out.println("deleteCourse");
        String courseId = "";
        CourseManager instance = null;
        boolean expResult = false;
        boolean result = instance.deleteCourse(courseId);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCourseById() {
        System.out.println("getCourseById");
        String courseId = "";
        CourseManager instance = null;
        Course expResult = null;
        Course result = instance.getCourseById(courseId);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCoursesByInstructor() {
        System.out.println("getCoursesByInstructor");
        String instructorId = "";
        CourseManager instance = null;
        List<Course> expResult = null;
        List<Course> result = instance.getCoursesByInstructor(instructorId);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
