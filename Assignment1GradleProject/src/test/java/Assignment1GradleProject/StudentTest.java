package Assignment1GradleProject;

import org.junit.Assert;
import java.util.ArrayList;
import org.junit.Test;
import java.util.ArrayList;
public class StudentTest {
	
	private Student student;
	
	
	public StudentTest()
	{
		student=new Student("Jesse",21,"25/10/2001",19273);
	}
	
	@Test
	public void testGetName()
	{
		Assert.assertEquals("Jesse", student.getName());
	}
	
	@Test
	public void testGetAge()
	{
		Assert.assertEquals(21, student.getAge());
	}
	
	
	@Test
	public void testGetDOB()
	{
		Assert.assertEquals("25/10/2001", student.getDOB());
	}
	
	
	@Test
	public void testGetId()
	{
		long randNum= 19273;
		Assert.assertEquals(randNum, student.getId());
	}
	

	
	@Test
	public void testGetModules()
	{
		ArrayList<Student> randomArrayList=null;
		Assert.assertTrue(student.getModules() instanceof ArrayList);
	}
	
	@Test
	public void testGetCourseProgrammes()
	{
		ArrayList<Student> randomArrayList=null;
		Assert.assertTrue(student.getCourseProgrammes() instanceof ArrayList);
	}
	
	

}