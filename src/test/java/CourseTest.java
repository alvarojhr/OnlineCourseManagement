import org.example.Course;
import org.example.Instructor;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

import java.util.List;

public class CourseTest {
    
    @BeforeEach
    void setUp(){
        Instructor instructor0 = new Instructor("12", "JP");
        Instructor instructor1 = new Instructor("34", "JD");
        Course course = new Course("00","COURSE 1",instructor0);
    }
    @Test
    void CourseCreation(){
    Instructor instructor1 = new Instructor("34", "JD");    
    Course course1 = new Course("00","COURSE 1",instructor1);    
    assertEquals("00",course1.getCourseId());
    assertEquals("COURSE 1",course1.getTitle());
    assertEquals(instructor1,course1.getInstructor());
    }
    
    
}
