package Day7;

public class LowestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,12,34,11,9,8,113};
		
		int low=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<low)
			{
				low=a[i];
			}
		}
		
		System.out.println("Lowest Element in this Array is: " +low);

	}

}
