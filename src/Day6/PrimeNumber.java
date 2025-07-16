package Day6;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=18;
		boolean flag=true;
		
		
		for(int i=2; i<n; i++)
		{
			if(n%i == 0)
			{
				flag=false;
			}
		}
			
	 if (flag==true)
	 {
		 System.out.println("prime number");
		 
	 }
	 else
	 {
		 System.out.println("Not a prime number");
	 }
	 
	 
		
		
	}

	

}
