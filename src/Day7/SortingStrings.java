package Day7;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char s[]= {'D','A','B','G','C'};
		String a1[]= {"Asxw","wwxC","Bw213ws","Dqws2q"};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(s));
		Arrays.sort(a1);
		Arrays.sort(s);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(s));

		

	}

}
