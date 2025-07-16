package Day9;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcome to the java";
		
	int count=1;
	
	
	for(int i=0; i<s.length(); i++)
	{
		if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
		{	
			count++;
		}
		
	}
	
	System.out.println("Number of words in this string are: "  +count);

	}

}
