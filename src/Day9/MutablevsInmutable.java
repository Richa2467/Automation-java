package Day9;

import java.util.Arrays;

public class MutablevsInmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//mutable can change
		
//		int a[]= {40,11,121,25,67,43,27};
//		System.out.println(Arrays.toString(a));
//		Arrays.sort(a);                  //mutable - we can change
//		System.out.println(Arrays.toString(a));
		
		//immutable
		
		String s=new String("welcome");
		
		System.out.println(s);        //welcome
		
		String concatstring=s.concat("to java");
		System.out.println(s);       //welcome - immutable - we cannot change
		
		System.out.println(concatstring);

	}

}
