import org.example.Course;
import org.example.CourseDatabase;
import org.example.CourseManager;
import org.example.Instructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class courseManagerTest {
		private CourseManager course;
		private CourseDatabase data;
		@BeforeEach
		public void setUp() {
			data = mock(CourseDatabase.class);
			course = new CourseManager(data);
		}
		@Test
		public void whenCreateCourseIsTrue() {
			Course curso = new Course("curse1", "Geometry",new Instructor("1212", "Laguado Fernandez"));
			when(course.createCourse(curso)).thenReturn(true);
			assertEquals(true, "No se que poner aqui");
		}
		@Test
		public void whenCreateCourseIsFalse() {
			Course curso2 = null;
			when(course.createCourse(curso2)).thenReturn(null);
			assertEquals(false, course.getCourseById("515"));
		}
		@Test
		public void whenDeleteCourseIsFalse() {
				String id =null; 
			when(course.deleteCourse(id)).thenReturn(null);
			assertEquals(false, course.getCourseById("515"));		
			}
		@Test
		public void whenDeleteCourseIsTrue() {
			String id2 ="5151"; 
			when(course.deleteCourse(id2)).thenReturn(true);
			assertEquals(false, course.getCourseById("5151"));		
			}
		@Test
		public void getCourseById() {
			Course curso = new Course("curse2", "Geometry",new Instructor("1212", "Laguado Fernandez"));
			when(course.getCourseById("curse2")).thenReturn(curso);
			assertEquals(curso, course.getCourseById("curse2"));		
		}
		@Test
		public void getCoursesByInstructor() {
			Instructor yerryMina = new Instructor("Biology", "Yerri mina");
			Instructor Bacca= new Instructor("Maths", "Teofilo Gutierrez");
			Course curso1= new Course("12", "Curso1", yerryMina);
			Course curso2= new Course("13", "Curso2", Bacca);
			yerryMina.addCourse(curso1);
			Bacca.addCourse(curso2);
			when(course.getCoursesByInstructor("Geometry")).thenReturn(null);
			assertEquals(null, course.getCourseById("Geometry"));		
			//NO ME DIO LA CABEZA D;   
		}
}
