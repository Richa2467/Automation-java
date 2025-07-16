package Day4;

public class ifConditionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int person_age=15;
//		
//		if (person_age >=18)
//		{
//			System.out.println("eligible for vote");
//		}
//		else
//		{
//			System.out.println("Not eligible for Vote");
//	

//		int num=41;
//		
//		if(num%2 == 0)
//		{
//			System.out.println(num+ " is even number");
//			
//		}
//		else
//		{
//			System.out.println(num + " is odd number");
//		}
//	
		
//		int num=-8;
//		
//		if (num>0)
//		{
//			System.out.println(num +" is positive");
//		}
//		else if (num<0)
//		{
//			System.out.println(num +"  is negative");
//		}
//		else 
//		
//		{
//			System.out.println(num +" is Zero");
//		}
		
		
//		int a=10, b=20, c=58;
//		
//		
//		if(a>b && a>c)
//		{
//			System.out.println("a is the greatest number " +a);
//		}
//		
//		else if(b>a && b>c)
//		{
//			
//			System.out.println("b is the greatest number " +b);
//		}
//		
//		else
//		{
//			System.out.println("c is the greatest number  " +c);
//			
//		}

//		int weekno = 7;
//		
//		
//		switch(weekno)
//		{
//		
//		case 1:  System.out.println("Sunday"); break;
//		case 2:  System.out.println("Monday"); break;
//		case 3:  System.out.println("Tuesday"); break;
//		case 4:  System.out.println("Wednesday"); break;
//		case 5:  System.out.println("Thusday"); break;
//		case 6:  System.out.println("Friday"); break;
//		case 7:  System.out.println("Saturday"); break;
//		default: System.out.println("Invalid week number");
//
//		}
		
		
		int a=10, b=20, c=5;
		
		String x=(a>b)? "a":"b";
		
		System.out.println("largest of a and b is " +x);
		
		if(a>b)
		{
			System.out.println("a is largest");
		}else
		{
			
			System.out.println("b is the largest");
		}
		
		if(a<b && a<c)
		{
			System.out.println("a is the smallest");
		}
		else if(b<a && b<c)
		{
			System.out.println("b is the smallest ");
		}
		else 
		{
			System.out.println("c is the smallest");
			
		}
		
	}
		

}
