package Day3;

public class Decrementoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4. Decrement Operators
		
				// ++ is called increment operator
				
				
				//case 1
//				int a=10;
//				System.out.println(a);
//				a--;                  //a=a+1;
//				System.out.println(a);
			
				
				
				
				//case2 - post decrement
				
//				int a=10;
//				int res=a--;            //here decrementaion will happen after assignment.
//				System.out.println(res);  //10
//				System.out.println(a);    //9
				
				
				//case 3 - pre decrement
				int a=10;
				int res=--a;            // here first it will decrement the value, after that assignment will happen.
				System.out.println(res);  //9
				System.out.println(a);    //9
				 

	}

}
