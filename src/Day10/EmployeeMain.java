package Day10;
//import pacakagename.classname;


public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			Employee e=new Employee();  //object
			e.eid=101;
			e.ename="Sita";
			e.job="QA Engineer";
			e.sal=973941;
			System.out.println(e.eid);
			System.out.println(e.ename);
			e.display();
			
			
			Employee e1=new Employee();
			e1.eid=102;
			e1.ename="Shiva";
			e1.job="Software Developer";
			e1.sal=3686878;
			System.out.println(e1.job);
			System.out.println(e1.sal);
			e1.display();
			
			

	}

}
