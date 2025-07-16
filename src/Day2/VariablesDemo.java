package Day2;

public class VariablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;       // declaration
		a=100;       // assignment
		
		int b=12;      // declartion + assignment
	    System.out.println(a);    //100
	
	    a=200;
	    System.out.println(a);       //200
	
	    
	    //Approach 1               if all the variables belongs to different data types
	    int a1=100;
	    int b1= 200;
	    int c1= 300;
	    
	    
	    //Approach 2               if all the variables are belongs to same data type
	    int a2,b2,c2;
	    a2=100;
	    b2=200;
	    c2=300;
	    
	    
	    //Approach 3               if all the variables belongs to same data types
	    int a3=100,b3=200, c3=300;
	
	System.out.println("the value of a is : "  +a+ "the value of b is : " +b + "the value of c is : " +c1);
	System.out.println(a+ " " +b + "" +c1);

	}

}
