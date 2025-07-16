package Day5;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();	
		int nums=num;
	  //1. Using algorithm
		
		int rev=0;
		while(num!=0)
		{
			
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		if (rev == nums)
		{
			System.out.println("String is Plaindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		
		
// USing StringBufffer class
//		StringBuffer rev;
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		System.out.println(sb.reverse());
		
		
// Using StringBuilder class
//		StringBuilder sbl=new StringBuilder();
//		sbl.append(num);
//		System.out.println(sbl.reverse());
		
	
	}

}
