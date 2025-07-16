package Day9;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Case 1
		
	/*	String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		*/
		
		
        //Case 2
		
//		String s1=new String("welcome");
//		String s2=new String("welcome");          // whenever new keyword is used object is created.
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		System.out.println(s1==s2);                          //to compare the objects
//		System.out.println(s1.equals(s2));                   // to compare values of the object
		
		
		//Case 3
		
//		String s1="abc";
//		String s2=new String("abc");
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		
		
		//Case 4
		
		String s1="abc";
		String s2=new String("abc");
		
		String s3=s2;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		System.out.println(s2==s3);      //true because obj are same /equal
		System.out.println(s2.equals(s3));
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));

	}

}
