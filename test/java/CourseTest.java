import org.example.Course;
import org.example.Instructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class CourseTest {
    private String courseId = "C001";
    private String title = "Introduction to Java";
    private Instructor instructor;
    private Course course;

    @BeforeEach
    void setUp() {
        instructor = new Instructor("I001", "Dr. Smith");
        course = new Course(courseId, title, instructor);
    };

    @Test
    void testGetCourseId() {
        assertEquals(courseId, course.getCourseId());
    }
    
   
    @Test
    void testCourseId() {
        String courseId2 = "C002";
        course.setCourseId(courseId2);
        assertEquals(courseId2, course.getCourseId());
    }
    
    @Test
    void testGetTitle() {
        assertEquals(title, course.getTitle());
    }
   
    @Test
    void testSetTitle() {
        String title2 = "Junior to Expert Java";
        course.setTitle(title2);
        assertEquals(title2, course.getTitle());
    }

    @Test
    void testGetInstructor() {
        assertEquals(instructor, course.getInstructor());
    }
    
    @Test
    void testSetInstructor() {
        Instructor instructor2 = new Instructor("I002", "Dr. Johana");
        course.setInstructor(instructor2);
        assertEquals(instructor2, course.getInstructor());
    }

}
