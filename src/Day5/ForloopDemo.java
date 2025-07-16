package Day5;

public class ForloopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		for(int i=2; i<=10; i+=2)
		{
			System.out.println(i);
		}
		
		for(int i=1; i<=10; i++)
		{
			if(i% 2 == 0)
			{
			System.out.println("even"+i);
			}else
			{
				System.out.println("odd" +i);
			}
		}
		for(int i=10; i>=1; i--)
		{
			System.out.println(i);
		}
		
	}

}
