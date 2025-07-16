package Day7;

import java.util.Arrays;

public class SortingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int[] a = {5, 2, 8, 1, 3};

	        System.out.println("Before Sorting: " + Arrays.toString(a));

	        int temp;
	        for (int i = 0; i < a.length - 1; i++) {
	            for (int j = 0; j < a.length - 1; j++) {
	                if (a[j] > a[j + 1]) {
	                    // swap a[j] and a[j + 1]
	                    temp = a[j];
	                    a[j] = a[j + 1];
	                    a[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("After Sorting: " + Arrays.toString(a));
	    }

	}


