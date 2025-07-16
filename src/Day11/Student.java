package Day11;

public class Student {
	
	int sid;
	String sname;
	char grad;
	
	
	void pirntstudata()
	{
		System.out.println(sid+ " "+sname+ " "+grad);
	}

	void setStudentdata(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
		
		
	}
	
	Student(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
		
	}
	
	
	
	
}
