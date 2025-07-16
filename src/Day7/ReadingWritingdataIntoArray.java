package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingWritingdataIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter a value for positon :  " +i);
			 a[i]=sc.nextInt();
		}
		
		System.out.println("printing arrays elements");
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
			
		}
		

	}

}
