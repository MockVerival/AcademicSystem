package academicSystem.tests.jmock.people;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Test;

import academicSystem.course.Course;
import academicSystem.course.Discipline;
import academicSystem.library.Book;
import academicSystem.people.Student;

public class StudentTest {
	private Mockery context = new JUnit4Mockery() {
	    {
	        setImposteriser(ClassImposteriser.INSTANCE);
	    }
	};

	@Test
	public void testPeriodsMissing() {
		final int expectedValue = 10;
		
        final Course mockCourse = context.mock(Course.class);
        
        context.checking(new Expectations() {{
            oneOf (mockCourse).getPeriods();
                will(returnValue(expectedValue));
        }});
        
        Student student = new Student(mockCourse);
        int actualValue = student.periodsMissing();
        assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testGetCreditsCoursed(){
		final Discipline disciplineMock1 = context.mock(Discipline.class);
		
		final Course courseMock = context.mock(Course.class);
		context.checking(new Expectations(){{
			oneOf (disciplineMock1).getCredits();
				will(returnValue(4));
		}});
		
		Student student = new Student(courseMock);
		
		student.addDiscipline(disciplineMock1);
		int quantCredits = student.getCreditsCoursed();
		assertEquals(4, quantCredits);
	}

	@Test
	public void testAddBookValid() {
		final Course courseMock = context.mock(Course.class);
		Student student = new Student(courseMock);
		
		final Book bookMock = context.mock(Book.class);
		
		context.checking(new Expectations() {{
            oneOf (bookMock).getStatus();
            will(returnValue("Disponível"));
        }});
		
		student.addBook(bookMock);
		assertEquals(student.getBooks().size(), 1);
	}
	
	@Test
	public void testAddBookInvalid() {
		final Course courseMock = context.mock(Course.class);
		Student student = new Student(courseMock);
		
		final Book bookMock = context.mock(Book.class);
		
		context.checking(new Expectations() {{
            oneOf (bookMock).getStatus();
            will(returnValue("Emprestado"));
        }});
		
		student.addBook(bookMock);
		assertTrue(student.getBooks().isEmpty());
	}
	
	@Test
	public void testReturnBook() {
		final Course courseMock = context.mock(Course.class);
		Student student = new Student(courseMock);
		
		final Book bookMock = context.mock(Book.class);
		
		context.checking(new Expectations() {{
            oneOf (bookMock).getStatus();
            will(returnValue("Disponível"));
        }});
		
		student.addBook(bookMock);
		student.returnBook(bookMock);
		
		assertEquals(student.getBooks().size(), 0);
	}
}
