package Day16;
interface Shape
{
    int length=10;      //final & static
    int width=20;        //final & static
    
    void circle();       //abstract method
    
    default void square()
    {
    	System.out.println("this is square- default method.");
    }
    
    
    static void rectangele()
    {
    	System.out.println("this is recentagle- static method");
    }
    
    
}

public class InterfaceDemo implements Shape
{
	public void circle() 
	{
		System.out.println("This is circle --- static method");
	}

	void traingle()
	{
		System.out.println("This is traingle ------ default method");
	}
	int x=100, y=200;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scenario 1
		InterfaceDemo c= new InterfaceDemo();
//		c.circle();     //abstract class
//		c.square();     //default
//		Shape.rectangele();                     //directly can not be access by class 
		                                        // static method can directly access from interface.
//		c.traingle();
		System.out.println(c.x*c.y);
		
		
		//Scenario 2
		
		
		Shape sh=new InterfaceDemo();
		sh.circle();      //abstract
		sh.square();     //default
		Shape.rectangele();      //static method can directly access from interface.
//		sh.traingle();              //not possible
		
		System.out.println(Shape.length* Shape.width);                //accessing static variable directly. object is not needed.
//		System.out.println(sh.x*sh.y);                               //not possible
		

	}

}
