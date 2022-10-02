package Assignment1GradleProject;

import java.util.ArrayList;

public class Lecturer {
	
	private String name;
	private int age;
	private String DOB;
	private long ID;
	private String username;
	
	// object references  other classes (Students have a list of modules and have a list of courseProgrammes registered for)
	private ArrayList<Module> modulesTeaching;
	
	//constructor
	public Lecturer(String name, int age, String DOB, long ID)
	{
		this.name=name;
		this.age= age;
		this.DOB= DOB;
		this.ID= ID;
		this.username= getUsername();
		
		modulesTeaching= new ArrayList<Module>();
		
;		
	}
	
	//accessor methods
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getDOB()
	{
		return DOB;
	}
	
	public long getId()
	{
		return ID;
	}
	
	public String getUsername()
	{
		return (name+String.valueOf(age));
	}
	
	public ArrayList getModules()
	{
		return modulesTeaching;
	}
	
	
	
	//mutator methods
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public void setDOB(String DOB)
	{
		this.DOB=DOB;
	}
	
	public void setId(long ID)
	{
		this.ID=ID;
	}
	
	public void addModule(Module module)
	{
		modulesTeaching.add(module);
		
	}
	
	
	

}
