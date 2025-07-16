package Day8;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s="welcome";
		
		String s=new String("welcome");
		
		
		// length()- return length of a string(number of character)
		s.length();
		System.out.println(s.length());
		System.out.println("welcome".length()); //7
		
		//concat()       joining strings
		
		
		
		String s1="welcome";
		String s2="to java";
		String s3="Automation";
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		
		System.out.println(s1.concat(s2+s3));
		System.out.println("welcome"+" to java");
		System.out.println("welcome".concat("to java"));
		
		//trim()   - remove spaces right and left side.
		s=" welcome ";
		System.out.println("Before Trimming" +s.length());
		System.out.println(s);
		System.out.println("After trimming "+s.trim().length());
		
		
		
		//charAt() - returns a charactre from a string based on index
		s="welcome";
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(0));
		
		//contains()- returns true or false
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("com"));
		System.out.println(s.contains("welcem"));
		
		
		//equals() , and equalsIgnoreCase() - compare strings
		
		s1="welcome";
		s2="welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.endsWith("Welcome"));
		System.out.println(s1.equalsIgnoreCase("Welcome"));
		
		
		//replace() - replace single/multiple(sequence) of characters in a string
		s="welcome to java selenium java python selenium";
	   System.out.println(s.replace('e', 'X'));
	   System.out.println(s.replace("selenium", "robotframework"));
	   
	   
	   //substring() - extract substring from the main string.
	   s="welcome";
	   System.out.println(s.substring(0,3));
	   System.out.println(s.substring(3, 7));
	   
	   
	   //toUpperCase()
	   System.out.println(s.toUpperCase());
	   System.out.println(s.toLowerCase());
	   
	   
	   //split()- split the string into mutliple parts based on delimiter
	   s="abcdfr@gmail.com";
	   
	   String a[]=s.split("@");
	   System.out.println(a[0]);
	   System.out.println(a[1]);
	   
		System.out.println(Arrays.toString(a));
		
		
		//ex1
		String amount="$15,20,55";
		System.out.println(amount.replace("$","").replace(",", ""));
		
		//ex2
		s="abc,123@xyz";
		
		String a1[]=s.split(",");
		System.out.println(Arrays.toString(a1));
		
		String a2[]=a1[1].split("@");
		System.out.println(Arrays.toString(a2));
		System.out.println(a1[0]);
		System.out.println(a2[0]);
		System.out.println(a2[1]);
		
		
		//ex3
		s="abc 123";
		String arr[]=s.split(" ");
		System.out.println(Arrays.toString(arr));
		
		//ex4
		String name="John kenedy";
		System.out.println(name.contains("john"));
		System.out.println(name.toLowerCase().contains("john"));
		System.out.println(name.replace('J', 'j').contains("john"));

	}

}
