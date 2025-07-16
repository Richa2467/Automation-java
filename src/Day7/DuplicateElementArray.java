package Day7;

public class DuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,2,34,11,9,8,11,3,11,23,22,11};
		int ele=11;
		
		int count=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==ele)
			{
				System.out.println("ele got find at index:   "+i);
				count++;
			}
			
		}
		
		System.out.println("Number of duplicates of "+ele+ " is " +count);
		

	}

}
