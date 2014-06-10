package academicSystem.tests.easymock.people;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Test;

import academicSystem.course.Course;
import academicSystem.course.Discipline;
import academicSystem.library.Book;
import academicSystem.people.Student;

public class StudentTestTest {

	@Test
	public void testPeriodsMissing() {
		final int expectedValue = 10;
		
		Course courseMock = EasyMock.createMock(Course.class);
		EasyMock.expect(courseMock.getPeriods()).andReturn(expectedValue);
		EasyMock.replay(courseMock);
		
		Student student = new Student(courseMock);
        int actualValue = student.periodsMissing();
        assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testGetCreditsCoursed(){
		Discipline disciplineMock = EasyMock.createMock(Discipline.class);
		EasyMock.expect(disciplineMock.getCredits()).andReturn(4);
		EasyMock.replay(disciplineMock);

		Course courseMock = EasyMock.createMock(Course.class);
		EasyMock.replay(courseMock);
		Student student = new Student(courseMock);
		
		student.addDiscipline(disciplineMock);
		int quantCredits = student.getCreditsCoursed();
		assertEquals(4, quantCredits);
	}
	
	@Test
	public void testAddBookValid() {
		Course courseMock = EasyMock.createMock(Course.class);
		EasyMock.replay(courseMock);
		Student student = new Student(courseMock);
		
		Book bookMock = EasyMock.createMock(Book.class);
		EasyMock.expect(bookMock.getStatus()).andReturn("Disponível");
		EasyMock.replay(bookMock);
		
		student.addBook(bookMock);
		assertEquals(student.getBooks().size(), 1);
	}
	
	@Test
	public void testAddBookInvalid() {
		Course courseMock = EasyMock.createMock(Course.class);
		EasyMock.replay(courseMock);
		Student student = new Student(courseMock);
		
		Book bookMock = EasyMock.createMock(Book.class);
		EasyMock.expect(bookMock.getStatus()).andReturn("Emprestado");
		EasyMock.replay(bookMock);
		
		student.addBook(bookMock);
		assertTrue(student.getBooks().isEmpty());
	}
	
	@Test
	public void testReturnBook() {
		Course courseMock = EasyMock.createMock(Course.class);
		EasyMock.replay(courseMock);
		Student student = new Student(courseMock);
		
		Book bookMock = EasyMock.createMock(Book.class);
		EasyMock.expect(bookMock.getStatus()).andReturn("Disponível");
		EasyMock.replay(bookMock);
		
		student.addBook(bookMock);
		student.returnBook(bookMock);
		
		assertEquals(student.getBooks().size(), 0);
	}
}
