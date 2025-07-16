package Day19;

class Parent
{
  String name="John";
  void m1()
  {
	  System.out.println("this is m1 from parent....");
  }
	
}
class Child extends Parent
{
	int id=101;
  void m2()
  {
	  System.out.println("this is m2 from Child....");
  }
	
}

public class TypeCastingObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Child c=new Child();
//		System.out.println(c.name);  //Parent
//		c.m1();     //Parent
//		System.out.println(c.id);      //child
//		c.m2();   //child
//		
//		Parent p=new Child();          //upcasting
//		System.out.println(p.name);
//		p.m1();
//		System.out.println(p.id);      //child   we can not access even if we created obj for the child class.
//		p.m2();   //child
		
		Parent p=new Parent();
		Child c=(Child)p;
		
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
		
		
		
		
		
		

	}

}
