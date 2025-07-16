package Day5;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		int num=202883;
		int temp=num;
		

//		while(temp!=0)
//		{
//			int lastdigit=temp%10;
//			count+=1;
//			temp=temp/10;
//		}
//		System.out.println(count);

//
//		int even=0;
//		int odd=0;
//		
//		while (temp != 0) {
//            int lastDigit = temp % 10;  // Get last digit
//
//            if (lastDigit % 2 == 0) {
//                even++;  // Count even digit
//            } else {
//                odd++;   // Count odd digit
//            }
//
//            temp = temp / 10;  // Remove last digit — must be inside the loop!
//        }
//
//        System.out.println("Even digits: " + even + ", Odd digits: " + odd);
    
	 int sum=0;
	 while(temp!=0)
			{
				int lastdigit=temp%10;
				sum+=lastdigit;
				temp=temp/10;
			}
			System.out.println(sum);
	
	
	
	
	}
	}
