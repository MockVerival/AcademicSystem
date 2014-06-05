package academicSystem.tests.jmock.course;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Test;

import academicSystem.course.Course;
import academicSystem.course.Discipline;
import academicSystem.people.Student;

public class CourseTest {
	private Mockery context = new JUnit4Mockery() {
    {
        setImposteriser(ClassImposteriser.INSTANCE);
    }
    };

	@Test
	public void testAddDisciplineValid() {
		Course course = new Course(0, 4);
		
		final Discipline disciplineMock = context.mock(Discipline.class);
		
		context.checking(new Expectations() {{
            oneOf (disciplineMock).getCredits();
            will(returnValue(2));
        }});

		course.addDiscipline(disciplineMock);
		assertEquals(course.getDisciplines().size(), 1);
	}

	@Test
	public void testAddDisciplineValid2() {
		Course course = new Course(0, 4);
		
		final Discipline disciplineMock = context.mock(Discipline.class);
		
		context.checking(new Expectations() {{
            oneOf (disciplineMock).getCredits();
            will(returnValue(4));
        }});

		course.addDiscipline(disciplineMock);
		assertEquals(course.getDisciplines().size(), 1);
	}
	
	@Test
	public void testAddDisciplineInvalid() {
		Course course = new Course(0, 4);
		
		final Discipline disciplineMock = context.mock(Discipline.class);
		
		context.checking(new Expectations() {{
            oneOf (disciplineMock).getCredits();
            will(returnValue(5));
        }});

		course.addDiscipline(disciplineMock);
		assertTrue(course.getDisciplines().isEmpty());
	}
	
	@Test
	public void testAddStudent() {
		Course course = new Course(0, 4);
		
		final Student studentMock = context.mock(Student.class);
		
		context.checking(new Expectations() {{
            oneOf (studentMock).getName();
            will(returnValue("StudentTest"));
        }});

		course.addStudent(studentMock);
		assertEquals(course.getStudents().size(), 1);
		
		assertEquals(course.getStudents().get(0).getName(), "StudentTest");
	}
}
