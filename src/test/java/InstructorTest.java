import org.example.Course;
import org.example.Instructor;
import org.example.Assignment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class InstructorTest {
    private Instructor instructor;
    private Course course1, course2;
    private Assignment a1, a2;

    @BeforeEach
    void setUp() {
        instructor = new Instructor("I001", "Dr. Smith");
        course1 = new Course("C001", "Introduction to Java", instructor);
        course2 = new Course("C002", "Data Structures in Java", instructor);
        a1 = new Assignment("Exam2", instructor);
        a2 = new Assignment("Final Lab", instructor);
    }

    @Test
    void addCourse() {
        instructor.addCourse(course1);
        assertTrue(instructor.getCourses().contains(course1));
    }

    @Test
    void addMultipleCourses() {
        instructor.addCourse(course1);
        instructor.addCourse(course2);
        List<Course> courses = instructor.getCourses();
        assertTrue(courses.contains(course1) && courses.contains(course2));
    }

    @Test
    void removeCourse() {
        instructor.addCourse(course1);
        instructor.removeCourse(course1);
        assertFalse(instructor.getCourses().contains(course1));
    }

    @Test
    void removeCourseNotAdded() {
        instructor.addCourse(course1);
        instructor.removeCourse(course2); // Trying to remove a course not added
        assertFalse(instructor.getCourses().contains(course2));
        assertTrue(instructor.getCourses().contains(course1));
    }

    @Test
    void removeCourseFromEmptyList() {
        instructor.removeCourse(course1); // Removing from an empty list
        assertFalse(instructor.getCourses().contains(course1));
    }
    
    @Test
    void addAssignment() {
    	instructor.addAssignment(a1);
    	assertTrue(instructor.getAssignments().contains(a1));
    }
    
     @Test
     void AddMultipleAssignments() {
    	 instructor.addAssignment(a1);
    	 instructor.addAssignment(a2);
    	 List<Assignment> assignments = instructor.getAssignments();
    	 assertTrue(assignments.contains(a1)&&assignments.contains(a2));
     }
     
     @Test
     void removeAssignment() {
    	instructor.addAssignment(a1);
        instructor.removeAssignment(a1);
        assertFalse(instructor.getAssignments().contains(a1));
     }

     @Test
    void removeAssignmentNotAdded(){
         instructor.addAssignment(a1);
         instructor.removeAssignment(a2);
         assertFalse(instructor.getAssignments().contains(a2));
         assertTrue(instructor.getAssignments().contains(a1));
    }

    @Test
    void removeAssignmentFromEmptyList(){
        instructor.removeAssignment(a1);
        assertFalse(instructor.getAssignments().contains(a1));
    }
}