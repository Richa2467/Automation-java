package Day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declartion
		ArrayList mylist=new ArrayList();
//		List mylist=new ArrayList();            both are allowed for haterogenous data
//		ArrayList <String>mylist=new ArrayList<String>();
//		ArrayList <Integer>mylist1=new ArrayList<Integer>();
//		ArrayList <Employee>mylist2=new ArrayList<Employee>();          //all there are used for storing homogenous type of data
		
		
		
		//Adding data into aaraylist
		mylist.add(100);
		mylist.add(10.2);
		mylist.add("Ram");
		mylist.add('A');
		mylist.add(true);
		mylist.add(null);
		mylist.add(null);
		
		
		//Size of arraylist
		System.out.println("Size of arraylist:" +mylist.size());

		//Priniting arraylist
		System.out.println("prinitng data from arraylist: " +mylist);
		
		
		//Remove element from ArrayList
		mylist.remove(5);           // 5 is index of element
		

		//Priniting arraylist
		System.out.println("prinitng data from arraylist: " +mylist);
		
		//insert an element in the arraylist
		mylist.add(4,123);
		System.out.println("After Insertion from arraylist: " +mylist);
		
		//modify element in the arraylist (modify/replace/change)
		mylist.set(2,"python");
		System.out.println("After replacing from arraylist: " +mylist);
		
		//Access specific element from arraylist
		System.out.println(mylist.get(2));             //3 is index
		
		
		//Reading all the elements from arraylist 
		
		
		//using normal for loop
		
//		for(int i=0; i<mylist.size(); i++)
//		{
//			
//			System.out.println(mylist.get(i));
//		}
//		
//		
//		//using for each loop
//		
//		for(Object x:mylist)
//		{
//			System.out.println(x);
//		}
//			
//		
//		//using iterator
//		Iterator it=mylist.iterator();
//		
////		System.out.println(it.next());           //print only first element if used without while loop.
//		
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//			
//		}
		
		
		//Checking arraylist is empty or not
		System.out.println(mylist.isEmpty());
		
		
		//remove all the elements from the array list
		ArrayList mylist2=new ArrayList();
		mylist2.add(123);
		mylist2.add(null);
		mylist2.add(100);
		
		
		mylist.removeAll(mylist2);
		
		System.out.println("After removing from arraylist: " +mylist);
		
		//removing all the elements
		mylist.clear();
		System.out.println("After Insertion from arraylist: " +mylist.isEmpty());
		

	}


}
