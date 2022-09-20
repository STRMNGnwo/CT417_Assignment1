package Assignment1GradleProject;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
public class LecturerTest {
	
	private Lecturer lecturer;
	
	public LecturerTest()
	{
		lecturer= new Lecturer("Mr.Heisenberg",28,"19/02/1994",197642);
	}
	
	@Test
	public void testGetName() {
	
		Assert.assertEquals("Mr.Heisenberg", lecturer.getName());
	}
	
	@Test
	public void testGetAge()
	{
		Assert.assertEquals(28, lecturer.getAge());
	}
	
	
	@Test
	public void testGetDOB()
	{
		Assert.assertEquals("19/02/1994", lecturer.getDOB());
	}
	
	
	@Test
	public void testGetId()
	{
		long randNum=197642;
		Assert.assertEquals(randNum, lecturer.getId());
	}
	
	@Test
	public void testGetUsername()
	{
		String username= lecturer.getName()+String.valueOf(lecturer.getAge());
		Assert.assertEquals(username, lecturer.getUsername());
	}
	
	
	/*@Test
	public void testGetModules()
	{
		ArrayList<Lecturer> randomArrayList=null;
		Assert.assertSame(randomArrayList, lecturer.getModules());
	}*/
	
}
