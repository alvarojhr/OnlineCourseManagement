import org.example.Course;
import org.example.Instructor;
import org.example.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

import java.util.List;
public class CourseManagementTest {
    @Mock
    private CourseDatabase CourseDB;
    
    @BeforeEach
     void setUp(){
    MockitoAnnotations.openMocks(this);
    CourseManager courseM = new CourseManager(CourseDB);
    Instructor instructor0 = new Instructor("12", "JP");
    Instructor instructor1 = new Instructor("34", "JD");
    Course course = new Course("00","COURSE 1",instructor0);
    Course course2 = new Course("01","COURSE 2",instructor1);
    }
     
}
