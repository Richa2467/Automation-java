package Day9;

public class PlaindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abbaa";
		
		String revs="";
		
		for (int i=0; i<s.length(); i++)
		{
			revs=s.charAt(i)+revs;
			
		}
       
		if (s.equals(revs))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not plaindrome");
		}
	}

}
