package Day6;

public class SumElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,11,12,13,14};
		int sum=0;
		
		for( int x:a)
		{
			sum+=x;
			
		}
		System.out.println(sum);
//		

		for( int x:a)
		{
			if(x%2 == 0)
			{
				System.out.println("even number: " +x);
			}
			else
			{
				System.out.println("Odd number " +x);
			}
		}
         
		
		
		

		
		
	}

}
