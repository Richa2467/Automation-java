package Day6;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//declaring array
		
		
		//Approach 1
		int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		
		
		//Approach 2
		int a1[]= {100,200,300,500};
		
		// find length of an array
		
		System.out.println(a.length);
		System.out.println(a1.length);
		
		// read single value from an array
		System.out.println(a[4]);        //here 4 is index
		
		
		//reading all the values from array.
		//Normal loop
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		
		//Enhanced for loop/ For Each loop
		
		for(int x:a)
		{
			System.out.println(a);
		}
		
		
	

	}

}
