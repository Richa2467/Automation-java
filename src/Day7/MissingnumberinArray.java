package Day7;

public class MissingnumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,4,5,3};     
		int n=5;                  //Total numbers expected from 1 to 5
		int expected_sum=n*(n+1)/2;
		int Actual_sum=0;
		
		int missing_num;
		for(int i=0; i<a.length; i++)
		{
			Actual_sum+=a[i];
		}
		
		missing_num=expected_sum-Actual_sum;
		System.out.println("Missing Number in this array is :  "+missing_num);
		
	}

}
