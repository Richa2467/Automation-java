package Day5;

public class Whilelloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example 1                  print 1.......10 numbers
		
//		int i=1;                      //initilization
//		
//		while(i<=10)                   //condition
//		{
//			System.out.println(i);
//			i++;                      //inc
//		}
		
		//Example 2
//		
//		while(i<10)
//		{
//			
//			System.out.println("Hello");
//			i++;
//		}
//		
		int i=10;
		while(i>=1)
		{
			if(i%2==0)
			{
			System.out.println(i+ "even");
			}else
			{
				System.out.println(i + "odd");
			}
			i--;
		}

	}

}
