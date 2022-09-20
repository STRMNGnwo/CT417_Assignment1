package Assignment1GradleProject;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.Assert;

public class CourseProgrammeTest {
	
	private CourseProgramme cp ;
	
	public CourseProgrammeTest()
	{
		cp= new CourseProgramme("Discrete Maths",new DateTime(2022,11,1,9,0),new DateTime(2026,11,1,9,0),new ArrayList<Module>(),new ArrayList<Student>());
	}
	
	@Test
	public void testGetCourseName()
	{
		String courseName="Discrete Maths";
		Assert.assertEquals(courseName,cp.getCourseName());
	}
	
	@Test
	public void testGetStartDate()
	{
		DateTime start= new DateTime(2022,11,1,9,0);
		Assert.assertEquals(start,cp.getStartDate());
	}
	
	@Test
	public void testGetEndDate()
	{
		DateTime end= new DateTime(2026,11,1,9,0);
		Assert.assertEquals(end,cp.getEndDate());
	}
	
	@Test
	public void testGetEnrolledStudents()
	{
		Assert.assertTrue(cp.getEnrolledStudents() instanceof ArrayList);
	}
	
	public void testGetModules()
	{
		Assert.assertTrue(cp.getModules() instanceof ArrayList);
	}

}
