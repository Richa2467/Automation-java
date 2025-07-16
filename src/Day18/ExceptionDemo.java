package Day18;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program is started......");
		
		//Example 1
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number:");
//		int num=sc.nextInt();
//		
//		System.out.println(100/num);                  //Arithmatic Exception.
		
		//Example 2
//		int a[]=new int[5];
//		System.out.println("Enter the position(0-4):");
//		int pos=sc.nextInt();
//		
//		
//		System.out.println("Enter a value");
//		int value=sc.nextInt();
//		
//		a[pos]=value;         //ArrayIndexOutofBoundException
//		System.out.println(a[pos]);
		
		//Example 3
		String s="welcome";
//		int n=Integer.parseInt(s);        //NumberFormatException
//		System.out.println(n);
//		
		String s1=null;
		System.out.println(s1.length()); //Null pointer Exception
		
		System.out.println("Program is completed");
		System.out.println("Program is existed");
 
	}

}
