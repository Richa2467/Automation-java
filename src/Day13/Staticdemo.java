package Day13;

public class Staticdemo {
	
	static int a=10;            //static variable
	int b=20;                   // non-static variable.
	
	static void m1()             //static
	{
		System.out.println("This is m1 static method.......");
	}
	
	
	void m2()                  //non-static method
	{
		System.out.println("this is m2 non-static method......");
	}
	
	void m()                //non-static method
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(a);
//        m1();
        
//		System.out.println(b);             cannot access
//		m2();
        
        Staticdemo s=new Staticdemo();
//        System.out.println(s.b);
//        s.m2();
		s.m();
		

	}

}
