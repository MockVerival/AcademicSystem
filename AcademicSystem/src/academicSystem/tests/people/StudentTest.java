package academicSystem.tests.people;

import static org.junit.Assert.*;

import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Test;

import academicSystem.course.Course;

public class StudentTest {
	private Mockery context = new JUnit4Mockery() {
    {
        setImposteriser(ClassImposteriser.INSTANCE);
    }
    };
    
	@Test
	public void test() {
		Course course = context.mock(Course.class);
	}

}
