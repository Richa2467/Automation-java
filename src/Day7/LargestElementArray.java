package Day7;

public class LargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,2,34,11,9,8,113};
		
		int max=a[0];
		
		for(int i=1; i<a.length;  i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		
		System.out.println(max);

	}

}
