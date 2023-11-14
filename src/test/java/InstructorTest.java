import org.example.Course;
import org.example.Instructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class InstructorTest {
    private Instructor instructor;
    private Course course1, course2;

    @BeforeEach
    void setUp() {
        instructor = new Instructor("I001", "Dr. Smith");
        course1 = new Course("C001", "Introduction to Java", instructor);
        course2 = new Course("C002", "Data Structures in Java", instructor);
    }

    @Test
    void addCourseisfalse() {
        Course prueba1 = new Course("C001", "introduction to java", null);
       // when(course.getCourseId("null")).thenReturn(prueba1);
        assertEquals(true, Course.class); 
        //instructor.addCourse(course1);
        //assertTrue(instructor.getCourses().contains(course1));
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

    private Object when(String courseId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
