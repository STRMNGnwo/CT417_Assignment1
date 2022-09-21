package Assignment1GradleProject;

import java.util.ArrayList;
import org.joda.time.DateTime;
public class CourseProgramme {
	
	private String courseName;
	private ArrayList<Module> modules;
	private ArrayList<Student> enrolledStudents;
	private DateTime startDate;
	private DateTime endDate;
	
	public CourseProgramme(String courseName)
	{
		this.courseName=courseName;
		startDate= new DateTime(2022,11,1,9,0); //year,month,day,hour,minute
		endDate= new DateTime(2026,10,31,23,0);
		
		modules= new ArrayList<Module>();
		enrolledStudents= new ArrayList<Student>();
	}
	
	public CourseProgramme(String courseName, DateTime startDate,DateTime endDate)
	{
		this.courseName=courseName;
		this.startDate=startDate;
		this.endDate=endDate;
	}
	
	public CourseProgramme(String courseName, DateTime startDate,DateTime endDate,ArrayList<Module> modules,ArrayList<Student> arrayList ) 
	{
		this.courseName=courseName;
		this.startDate=startDate;
		this.endDate=endDate;
		
		this.modules= modules;
		this.enrolledStudents=arrayList;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public ArrayList<Student> getEnrolledStudents() {
		return enrolledStudents;
	}
	
	public ArrayList<Module> getModules()
	{
		return modules;
	}
	
	public void addModule(Module module)
	{
		modules.add(module);
	}
	
	public void setModules(ArrayList<Module> modules)
	{
		this.modules=modules;
	}

	public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}
	
	public void addEnrolledStudent(Student s)
	{
		enrolledStudents.add(s);
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		String returnString="Course:\n";
		
		returnString+=this.courseName+"\n"+"Start Date: "+startDate+"\n End Date: "+endDate;
		
		returnString+="\n\nModules in this course:";
		
		for(Module m: modules)
		{
			returnString+=m.getModuleName();
			returnString+="\n Lecturer responsible: "+m.getLecturerResponsible().getName();
		}
			
		return returnString;
		
	}
}
