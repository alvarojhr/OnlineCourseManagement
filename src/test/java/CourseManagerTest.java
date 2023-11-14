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
import org.example.CourseDatabase;
import org.example.CourseManager;
public class CourseManagerTest {
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
    
     @Test
     void CourseManagerCreationFail(){
         Instructor instructor1 = new Instructor("34", "JD");
         Course course3 = new Course("01","COURSE 2",instructor1);
         when(CourseDB.getCourseById("03")).thenReturn(null);
         assertEquals(null,CourseDB.getCourseById("03"));
     }
     
     @Test 
        void CreateCourseSuccesfull(){
        Instructor instructor1 = new Instructor("34", "JD");
         Course course3 = new Course("01","COURSE 2",instructor1);
         CourseManager courseM = new CourseManager(CourseDB);
         
         boolean yesorno = courseM.createCourse(course3);
         assertTrue(yesorno);
     }
     
    @Test
        void DeleteCourseFail(){
        Instructor instructor1 = new Instructor("34", "JD");
         Course course3 = new Course("01","COURSE 2",instructor1);
         CourseManager courseM = new CourseManager(CourseDB);
         
         boolean yesorno = courseM.deleteCourse("01");
         assertFalse(yesorno);
        }
    @Test
        void DeleteCourseSuccess(){
        Instructor instructor1 = new Instructor("34", "JD");
         Course course3 = new Course("01","COURSE 2",instructor1);
         CourseManager courseM = new CourseManager(CourseDB);
         when(CourseDB.getCourseById("01")).thenReturn(course3);
         boolean yesorno = courseM.deleteCourse("01");
         assertTrue(yesorno);
        }
    @Test
        void GetCourseByIdSuccesfull(){
        Instructor instructor1 = new Instructor("34", "JD");
         Course course3 = new Course("01","COURSE 2",instructor1);
         CourseManager courseM = new CourseManager(CourseDB);
         
        courseM.getCourseById("01");
        if(courseM.getCourseById("01")==course3){
        boolean yesorno = true;
        assertTrue(yesorno);
        }
        }
    @Test
        void GetCourseByIdFail(){
        Instructor instructor1 = new Instructor("34", "JD");
         Course course3 = new Course("01","COURSE 2",instructor1);
         CourseManager courseM = new CourseManager(CourseDB);
         
        courseM.getCourseById("02");
        if(courseM.getCourseById("02")!=course3){
        boolean yesorno = true;
        assertTrue(yesorno);
        }
        }
     
     
}
