package Day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Arithmatice Operators    + - * / %
		
		int a=100, b=20;
		
		System.out.println("Sum of a and b is:" +(a+b));
		System.out.println("Difference of a and b is:" +(a-b));
		System.out.println("Multiplication of a and b is:" +(a*b));
		System.out.println("division of a and b is:" +(a/b));
		System.out.println("Modulo of a and b is:" +(a%b));
		
		
		
		//2. Relational/comparison operators  > >= < <= != ==
		//return boolean value - true/false
		
		System.out.println(a>b); //true
		System.out.println(a<b);  //false
		System.out.println(a>=b);  //true
		System.out.println(a<=b);  //false
		System.out.println(a!=b);  //true
		System.out.println(a==b);  //false
		
		
		//3. Logical Operators   && || !
		// returns boolean value - true/false
		// works between two boolean values.
		
		
		
		boolean x=true, y=false;
		System.out.println(x && y);  //false
		System.out.println(x || y);  // true
		System.out.println(!x);      //false
		System.out.println(!y);      //true
		
		boolean b1=10>20;
		System.out.println(b1);    //false
		
		boolean b2=20>10;
		System.out.println(b2);     //true
		
		
		System.out.println(b1 && b2);   //false
		System.out.println(b1 || b2);   //true
		
		System.out.println((10<20)  && (20<10));   //false
		
		
	

	}

}
