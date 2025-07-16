package Day18;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Program is started.....");
		
		String s=null;
		try
		{
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Catch block Handled execption");
			System.out.println(e.getMessage());
		}
		finally
		{
			
			System.out.println("you entered into fiannly block....");
			
		}
		
		
		
		
		System.out.println("Program finished......");

	
		
		

	}

}
