package Day14;
	class A
	{
		int a=100;
		void display()
		{
			System.out.println(a);
		}
	}
	
	
	class B extends A
	{
		int b=200;
		void show()
		{
			System.out.println(b);
		}
		
	}
	
	
	class C extends B
	{
		int c=300;
		void print()
		{
			System.out.println(c);
		}
		
	}
	
	
	
	

public class InheritanceTypes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		B objb=new B();
//		System.out.println(objb.a);
//	    System.out.println(objb.b);
//	    
//	    objb.show();
//	    objb.display();
		
		C objc=new C();
		objc.a=100;
		objc.b=200;
		objc.c=300;
		System.out.println();

	}

}
