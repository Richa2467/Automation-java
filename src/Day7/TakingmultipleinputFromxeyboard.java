package Day7;

import java.util.Scanner;

public class TakingmultipleinputFromxeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		
//		int num1=sc.nextInt();
//		
//		System.out.println("Enter Second number");
//		int num2=sc.nextInt();
//		
//		System.out.println("sum of two numbers is  "+(num1+num2));
		
		System.out.println("Enter name: ");
		
		
		
		String name=sc.next();
		System.out.println("your name is: " +name);
		
		System.out.println("Enter Unknown type");
		Object value=sc.next();
		
		System.out.println("Your name is: "  +value);
		
	}

}
