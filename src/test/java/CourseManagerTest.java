
import java.util.ArrayList;
import java.util.List;
import org.example.Course;
import org.example.CourseDatabase;
import org.example.CourseManager;
import org.example.Instructor;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author informatica
 */
public class CourseManagerTest {

    private CourseManager courseManager;
    private Instructor instructor;
    private Course course1, course2;
    @Mock
    private CourseDatabase CDB;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        courseManager = new CourseManager(CDB);
        instructor = new Instructor("I001", "Dr. Smith");
        course1 = new Course("C001", "Introduction to Java", instructor);
        course2 = new Course("C002", "Data Structures in Java", instructor);
    }

    @Test
    public void createCourse() {
        assertTrue(courseManager.createCourse(course1));
    }
    @Test
    public void tryCreateNullCourse(){
        assertFalse(courseManager.createCourse(null));
    }
    
    @Test
    public void deleteCourse(){  
        //Arrange
        when(CDB.getCourseById("C001")).thenReturn(course1);
        //Assert
        assertTrue(courseManager.deleteCourse("C001"));
    }
    @Test
    public void tryDeleteNullCourse(){  
        //Arrange
        when(CDB.getCourseById("C001")).thenReturn(null);
        //Assert
        assertFalse(courseManager.deleteCourse("C001"));
    }
    
    @Test
    public void getCoursebyId(){
        //Arrange
        when(CDB.getCourseById("C001")).thenReturn(course1);
        //Assert
        assertEquals(course1, courseManager.getCourseById("C001"));
    }
    
    @Test
    public void tryGetCoursebyNullId(){
        assertEquals(null, courseManager.getCourseById(null));
    }
    
    @Test
    public void getCoursesbyInstructorId(){
        //Arrange
        List<Course> courses = new ArrayList <> ();
        courses.add(course1);
        courses.add(course2);
        when(CDB.getCoursesByInstructorId("I001")).thenReturn(List.of(course1, course2));
        
        //Act
        assertEquals(courseManager.getCoursesByInstructor("I001"), courses);
    }
    
    @Test
    public void tryGetCoursesbyNullInstructorId(){
        assertEquals(null, courseManager.getCoursesByInstructor(null));
    }

}
