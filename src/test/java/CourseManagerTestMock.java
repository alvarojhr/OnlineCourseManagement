import org.example.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CourseManagerTestMock {

   private CourseManager system;
   private CourseDatabase CourseMocck; 
    private Instructor instructor;
    private Course course1;
   
   @BeforeEach
    public void setUp() {
        CourseMocck = mock(CourseDatabase.class);
        system = new CourseManager(CourseMocck);
        instructor = new Instructor("I001", "Dr. Smith");
        course1 = new Course("C001", "Introduction to Java", instructor);
    }
       @Test
       public void createCourseIsFalse() {
       when(CourseMocck.saveCourse(course1).thenReturn(null);
       assertEquals(false, system.createCourse(course1);
       }
    
       @Test
       public void createCourseIsTrue() {
          
        
        
        
    }
       
           @Test
       public void createCourseIsFalse() {
        
        
        
        
        
        
    }
// these without unit tests with mock in which the when specifies that when this () 
// and the return is it must return it as if it is null or something so that when with 
// assertEquals what we are giving to what is already 
}

       
       
       
       
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private CourseDatabase mock(Class<CourseDatabase> aClass) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


   
   
    
    
    
    
    
    
    
    
    
}

   
   
       
    




