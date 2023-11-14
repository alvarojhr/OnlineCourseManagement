import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class InstructorTest {

    private Instructor instructor;

    @BeforeEach
    public void setUp() {
        instructor = new Instructor("123", "John Doe");
    }

    @Test
    public void testAddCourse() {
        Course course = new Course("CS101", "Introduction to Programming");
        instructor.addCourse(course);
        Assertions.assertTrue(instructor.getCourses().contains(course));
    }

    @Test
    public void testRemoveCourse() {
        Course course = new Course("CS101", "Introduction to Programming");
        instructor.addCourse(course);
        instructor.removeCourse(course);
        Assertions.assertFalse(instructor.getCourses().contains(course));
    }

    @Test
    public void testGetInstructorId() {
        Assertions.assertEquals("123", instructor.getInstructorId());
    }

    @Test
    public void testSetName() {
        instructor.setName("Jane Doe");
        Assertions.assertEquals("Jane Doe", instructor.getName());
    }

    @Test
    public void testGetCourses() {
        Course course1 = new Course("CS101", "Introduction to Programming");
        Course course2 = new Course("CS102", "Advanced Programming");
        instructor.addCourse(course1);
        instructor.addCourse(course2);
        List<Course> expectedCourses = new ArrayList<>();
        expectedCourses.add(course1);
        expectedCourses.add(course2);
        Assertions.assertEquals(expectedCourses, instructor.getCourses());
    }

    @Test
    public void testEquals() {
        Instructor instructor1 = new Instructor("123", "John Doe");
        Instructor instructor2 = new Instructor("456", "Jane Doe");
        Assertions.assertTrue(instructor1.equals(instructor1));
        Assertions.assertFalse(instructor1.equals(null));
        Assertions.assertFalse(instructor1.equals(instructor2));
        Assertions.assertTrue(instructor1.equals(new Instructor("123", "John Doe")));
    }

    @Test
    public void testHashCode() {
        Instructor instructor1 = new Instructor("123", "John Doe");
        Instructor instructor2 = new Instructor("456", "Jane Doe");
        Assertions.assertEquals(instructor1.hashCode(), instructor1.hashCode());
        Assertions.assertNotEquals(instructor1.hashCode(), instructor2.hashCode());
        Assertions.assertEquals(instructor1.hashCode(), new Instructor("123", "John Doe").hashCode());
    }

    @Test
    public void testToString() {
        Assertions.assertEquals("Instructor{instructorId='123', name='John Doe', courses=[]}", instructor.toString());
    }
}