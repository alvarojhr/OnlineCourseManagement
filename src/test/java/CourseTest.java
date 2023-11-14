
import org.example.Course;
import org.example.Instructor;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author informatica
 */
public class CourseTest {
    private Instructor instructor1, instructor2;
    private Course course;

    @BeforeEach
    void setUp() {
        instructor1 = new Instructor("I001", "Dr. Smith");
        instructor2 = new Instructor("I002", "Camilo");
        course = new Course("C001", "Introduction to Java", instructor1);
    }
    
    @Test
    public void getCourseId(){
        assertEquals("C001", course.getCourseId());
    }
    
    @Test
    public void setCourseId(){
        course.setCourseId("C002");
        assertEquals("C002", course.getCourseId());
    }
    
    @Test
    public void getCourseTitle(){
        assertEquals("Introduction to Java", course.getTitle());
    }
    
    @Test
    public void setCourseTitle(){
        course.setTitle("POO");
        assertEquals("POO", course.getTitle());
    }
    
    @Test
    public void getCourseInstructor(){
        assertEquals(instructor1, course.getInstructor());
    }
    
    @Test
    public void setCourseInstructor(){
        course.setInstructor(instructor2);
        assertEquals(instructor2, course.getInstructor());
    }
    
}
