import org.example.Course;
import org.example.Instructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
import org.example.CourseDatabase;
import java.util.List;
import org.example.CourseDatabase;

public class InstructorTest {
    private Instructor instructor;
    private Course course1, course2;
    private CourseDatabase databaseMock;
    private Instructor instructorMock;

    private InstructorTest(CourseDatabase databaseMock) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @BeforeEach
    public void setUp() {
       //instructorMock = mock(Instructor.class);
        instructor = new Instructor("I001", "Dr. Smith");
        course1 = new Course("C001", "Introduction to Java", instructor);
        course2 = new Course("C002", "Data Structures in Java", instructor);
       //instructor = new InstructorTest(databaseMock);
    }

    @Test
    void addCourseIsTrue() {
        Course prueba1 = new Course("I001", "Introduccion to Java", instructor);
       // when(databaseMock.getCourseById("I001")).thenReaturn(prueba1);
       // instructor.addCourse(true);
        assertEquals(true, instructor.getCourses("I001"));
        assertTrue(instructor.getCourses().contains(instructor));
        
    }

    @Test
    void addCourseIsFalse() {
        
        Course prueba1 = new Course("123", "Angelica", instructor);
        //when (databaseMock.getCourseById("123")).thenReaturn(null);
       // instructor.addCourse();
        assertFalse(instructor.getCourses().contains(instructor));
        
    }
    
    @Test
    void addMultipleCoursesIsTrue() {
        instructor.addCourse(course1);
        instructor.addCourse(course2);
        List<Course> courses = instructor.getCourses();
        assertTrue(courses.contains(course1) && courses.contains(course2));
    }
    @Test
    void addMultipleCoursesIsFalse() {
        instructor.addCourse(course1);
        instructor.addCourse(course2);
        List<Course> courses = instructor.getCourses();
        assertTrue(courses.contains(course1) && courses.contains(course2));
    }

    @Test
    void removeCourseIsTrue() {
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

    private CourseDatabase mock(Class<CourseDatabase> aClass) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
