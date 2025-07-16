package Day6;

public class TwoDimenstionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring Array
		
		// Approach 1
		 int a[][]=new int[3][2];
//		 int [][]a= new int[3][2];
//		 int[]a[]=new int[3][2];
		 
		 a[0][0]=100;
		 a[0][1]=200;
		 
		 a[1][0]=300;
		 a[1][1]=400;
		 
		 a[2][0]=500;
		 a[2][1]=600;
		 
		 
		 //Approach 2
		 int a1[][]= {{100,200}, 
				      {300,400},
				      {500,600}};
		 
		 
		 //Find size of an Array
		 System.out.println("length of rows" +a.length);
		 System.out.println("length of columns"+a[0].length);
		 
		 // read single value from an array
		 System.out.println(a[2][1]);
		 
		 // read all data from 2 dimenstional array
		 //Normal loop
		 for(int i=0; i<a1.length; i++)
		 {
			 for(int j=0; j<a1[i].length; j++)
			 {
				 
				 System.out.print(a1[i][j]+ " ");
			 }
			 System.out.println();
		 }
		
		 
		 // Enhanced forloop
		 for(int arr[]:a)
		 {
			 
			 for(int x:arr)
			 {
				 System.out.print(x+ " ");
			 }
			 System.out.println();
		 }
}
}

