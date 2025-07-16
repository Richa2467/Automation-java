package Day3;

public class TernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var= exp ? result1 : result 2;
		
//		//Example 1
//		int a=100, b=200;
//		int x=(a>b)? a:b;            //if expression is true it will return first value if expression is false it will return second value
//		System.out.println(x);
		
		
		//Example 2
//		int x=(1==1)? 100:200;
//		System.out.println(x);       //100
		
//		
//		int x=(1==2)?200:100;
//		System.out.println(x);       //100
		
		
		//Example 3
//		int person_age=30;
//		String res=(person_age>=18)?"Eligible":"Not Eligible";
//		System.out.println(res);                //Eligible
		
		
		int a=10, b=20;
		int c=a+b;
		a = b;
		b=c-a;
		
		System.out.println(a+""+b);
		

	}

}
