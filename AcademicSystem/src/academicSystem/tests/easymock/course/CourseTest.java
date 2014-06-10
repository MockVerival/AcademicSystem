package academicSystem.tests.easymock.course;

import static org.junit.Assert.*;

import org.junit.Test;
import org.easymock.EasyMock;

import academicSystem.course.Course;
import academicSystem.course.Discipline;
//import academicSystem.people.Student;
import academicSystem.people.Student;

public class CourseTest {

	@Test
	public void testAddDisciplineValid() {
		Course course = new Course(0, 4);
		
		Discipline disciplineMock = EasyMock.createMock(Discipline.class);
		EasyMock.expect(disciplineMock.getCredits()).andReturn(2);
		
		course.addDiscipline(disciplineMock);
		assertEquals(course.getDisciplines().size(), 1);
	}

	@Test
	public void testAddDisciplineValid2() {
		Course course = new Course(0, 4);
		
		Discipline disciplineMock = EasyMock.createMock(Discipline.class);
		EasyMock.expect(disciplineMock.getCredits()).andReturn(4);
		EasyMock.replay(disciplineMock);
		
		course.addDiscipline(disciplineMock);
		assertEquals(course.getDisciplines().size(), 1);
	}

	@Test
	public void testAddDisciplineInvalid() {
		Course course = new Course(0, 4);
		
		Discipline disciplineMock = EasyMock.createMock(Discipline.class);
		EasyMock.expect(disciplineMock.getCredits()).andReturn(5);
		EasyMock.replay(disciplineMock);

		course.addDiscipline(disciplineMock);
		assertTrue(course.getDisciplines().isEmpty());
	}

	@Test
	public void testAddStudent() {
		Course course = new Course(0, 4);
		
		final Student studentMock = EasyMock.createMock(Student.class);
		EasyMock.expect(studentMock.getCreditsCoursed()).andReturn(5);
		EasyMock.replay(studentMock);
		
		course.addStudent(studentMock);
		assertEquals(course.getStudents().size(), 1);
		
		assertEquals(course.getStudents().get(0).getCreditsCoursed(), 5);
	}
}
