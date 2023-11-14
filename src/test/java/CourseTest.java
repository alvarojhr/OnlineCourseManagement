import org.example.Course;
import org.example.Instructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CourseTest {

    private Course course;
    private Instructor instructor;

    @BeforeEach
    public void setUp() {
        instructor = new Instructor("I001", "John Doe");
        course = new Course("CS101", "Introduction to Programming", instructor);
    }

    @Test
    public void testCourseId() {
        Assertions.assertEquals("CS101", course.getCourseId());
    }

    @Test
    public void testSetCourseId() {
        course.setCourseId("CS201");
        Assertions.assertEquals("CS201", course.getCourseId());
    }

    @Test
    public void testGetTitle() {
        Assertions.assertEquals("Introduction to Programming", course.getTitle());
    }

    @Test
    public void testSetTitle() {
        course.setTitle("Advanced Programming");
        Assertions.assertEquals("Advanced Programming", course.getTitle());
    }

    @Test
    public void testGetInstructor() {
        Assertions.assertEquals(instructor, course.getInstructor());
    }

    @Test
    public void testSetInstructor() {
        Instructor newInstructor = new Instructor("I002", "Jane Doe");
        course.setInstructor(newInstructor);
        Assertions.assertEquals(newInstructor, course.getInstructor());
    }

    @Test
    public void testEquals() {
        Course course1 = new Course("CS101", "Introduction to Programming", instructor);
        Course course2 = new Course("CS102", "Advanced Programming", instructor);
        Assertions.assertTrue(course1.equals(course1));
        Assertions.assertFalse(course1.equals(null));
        Assertions.assertFalse(course1.equals(course2));
        Assertions.assertTrue(course1.equals(new Course("CS101", "Introduction to Programming", instructor)));
    }

    @Test
    public void testHashCode() {
        Course course1 = new Course("CS101", "Introduction to Programming", instructor);
        Course course2 = new Course("CS102", "Advanced Programming", instructor);
        Assertions.assertEquals(course1.hashCode(), course1.hashCode());
        Assertions.assertNotEquals(course1.hashCode(), course2.hashCode());
        Assertions.assertEquals(course1.hashCode(), new Course("CS101", "Introduction to Programming", instructor).hashCode());
    }

    @Test
    public void testToString() {
        Assertions.assertEquals("Course{courseId='CS101', title='Introduction to Programming', instructor=Instructor{instructorId='I001', name='John Doe'}}", course.toString());
    }
}
