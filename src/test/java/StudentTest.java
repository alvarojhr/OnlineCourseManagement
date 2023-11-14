import org.example.Course;
import org.example.Student;
import org.example.Instructor;
import org.example.Assignment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class StudentTest {
    private Student student;

    private Course course1, course2;

    private Instructor instructor;

    @BeforeEach
    public void setup(){
        instructor = new Instructor("I001", "Dr. Smith");
        student = new Student("I001", "Alvaro");
        course1 = new Course("C001","Introduction to Java", instructor);
        course2 = new Course("C002", "Data Structures in Java", instructor);
    }

    @Test
    void enrollInACourse() {
        student.enrolInACourse(course1);
        assertTrue(student.getCourses().contains(course1));
    }

    @Test
    void enrollMultipleCourses() {
        student.enrolInACourse(course1);
        student.enrolInACourse(course2);
        List<Course> courses = student.getCourses();
        assertTrue(courses.contains(course1) && courses.contains(course2));
    }

    @Test
    void cancelACourse() {
        student.enrolInACourse(course1);
        student.cancelACourse(course1);
        assertFalse(student.getCourses().contains(course1));
    }

    @Test
    void cancelACourseNotAdded() {
        student.enrolInACourse(course1);
        student.cancelACourse(course2);
        assertFalse(student.getCourses().contains(course2));
        assertTrue(student.getCourses().contains(course1));
    }

    @Test
    void cancelACourseFromEmptyList() {
        student.cancelACourse(course1);
        assertFalse(student.getCourses().contains(course1));
    }
}
