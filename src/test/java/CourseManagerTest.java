import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.List;

public class CourseManagerTest {

    private CourseManager courseManager;
    private CourseDatabase database;

    @BeforeEach
    public void setUp() {
        database = Mockito.mock(CourseDatabase.class);
        courseManager = new CourseManager(database);
    }

    @Test
    public void testCreateCourse() {
        Course course = new Course("CS101", "Introduction to Programming");
        Mockito.when(database.saveCourse(course)).thenReturn(true);
        Assertions.assertTrue(courseManager.createCourse(course));
    }

    @Test
    public void testCreateCourseWithNullCourse() {
        Course course = null;
        Assertions.assertFalse(courseManager.createCourse(course));
    }

    @Test
    public void testCreateCourseWithNullCourseId() {
        Course course = new Course(null, "Introduction to Programming");
        Assertions.assertFalse(courseManager.createCourse(course));
    }

    @Test
    public void testCreateCourseWithNullTitle() {
        Course course = new Course("CS101", null);
        Assertions.assertFalse(courseManager.createCourse(course));
    }

    @Test
    public void testDeleteCourse() {
        String courseId = "CS101";
        Mockito.when(database.getCourseById(courseId)).thenReturn(new Course(courseId, "Introduction to Programming"));
        Mockito.when(database.deleteCourse(courseId)).thenReturn(true);
        Assertions.assertTrue(courseManager.deleteCourse(courseId));
    }

    @Test
    public void testDeleteCourseWithNullCourseId() {
        String courseId = null;
        Assertions.assertFalse(courseManager.deleteCourse(courseId));
    }

    @Test
    public void testDeleteCourseWithNonexistentCourseId() {
        String courseId = "CS101";
        Mockito.when(database.getCourseById(courseId)).thenReturn(null);
        Assertions.assertFalse(courseManager.deleteCourse(courseId));
    }

    @Test
    public void testGetCourseById() {
        String courseId = "CS101";
        Course course = new Course(courseId, "Introduction to Programming");
        Mockito.when(database.getCourseById(courseId)).thenReturn(course);
        Assertions.assertEquals(course, courseManager.getCourseById(courseId));
    }

    @Test
    public void testGetCourseByIdWithNullCourseId() {
        String courseId = null;
        Assertions.assertNull(courseManager.getCourseById(courseId));
    }

    @Test
    public void testGetCourseByIdWithNonexistentCourseId() {
        String courseId = "CS101";
        Mockito.when(database.getCourseById(courseId)).thenReturn(null);
        Assertions.assertNull(courseManager.getCourseById(courseId));
    }

    @Test
    public void testGetCoursesByInstructor() {
        String instructorId = "I001";
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("CS101", "Introduction to Programming"));
        courses.add(new Course("CS102", "Advanced Programming"));
        Mockito.when(database.getCoursesByInstructorId(instructorId)).thenReturn(courses);
        Assertions.assertEquals(courses, courseManager.getCoursesByInstructor(instructorId));
    }

    @Test
    public void testGetCoursesByInstructorWithNullInstructorId() {
        String instructorId = null;
        Assertions.assertNull(courseManager.getCoursesByInstructor(instructorId));
    }

    @Test
    public void testGetCoursesByInstructorWithNonexistentInstructorId() {
        String instructorId = "I001";
        Mockito.when(database.getCoursesByInstructorId(instructorId)).thenReturn(null);
        Assertions.assertNull(courseManager.getCoursesByInstructor(instructorId));
    }
}


