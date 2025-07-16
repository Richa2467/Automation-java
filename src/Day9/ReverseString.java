package Day9;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s="welcome";
//		
//		String revs="";
		
//		//Approach 1
//				for(int i=0; i<s.length(); i++)
//		{
//			revs=s.charAt(i)+revs;
//			
//		}
//		
//		System.out.println("Reverse String is: " +revs);
//		
//		
//		//Approach 2 - without using string methods
//	     char a[]=s.toCharArray();
//	     for(int i=a.length-1; i>=0; i--)
//	     {
//	    	 
//	    	 revs=revs+a[i];
//	     }
//		System.out.println("Reverse String is: " + revs);
//		
		
		
		//Aprroach 3- using StringBuffer Class
//		
//		StringBuffer s=new StringBuffer("welcome");
//		System.out.println("Reverse of a string is: " +s.reverse());
		
		//Approach 4- using StringBuilder Class
		
		StringBuilder s=new StringBuilder("welcome");
		System.out.println("Reverse of a string is: " +s.reverse() );

	}
}


