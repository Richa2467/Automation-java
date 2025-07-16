package Day9;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="missisipi";
		
		char occ='i';
		int count =0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==occ)
			{
				count++;
			}
		}
      System.out.println(count);
		
	}
	

}
