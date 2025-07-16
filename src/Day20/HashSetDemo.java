package Day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration
		
		HashSet myset=new HashSet();
//		Set myset=new HashSet();
//		HashSet <String>myset=new HashSet<String>();
		
		
		//adding elements in the HashSet
		myset.add(10);
		myset.add(10);
		myset.add('A');
		myset.add("Ram");
		myset.add(null);
		myset.add(10.5);
		
		
		//Priniting hashSet
		System.out.println("Printing hashset: " +myset);
		
		
		//removing elements in HashSet
		myset.remove(10.5);                    //this is value not index
		System.out.println("Printing hashset: " +myset);
		
		//Insertion is Not Possible(elements are in random order.)
		
		//Access specific element-   Not Possible
		
		
		//Convert Hashset to Arraylist
		
		ArrayList al=new ArrayList(myset);
		
		System.out.println(al);
		System.out.println(al.get(2));
		
		
		//Size of hashset
		System.out.println(myset.size());
		
		//Normal for loop - Not possible
		//Read all the elements using For ....each 
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		
		//Read Elements using Iterator
		
		Iterator <Object>it=myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//Clearing all the elements in hashset
		myset.clear();
		System.out.println(myset.isEmpty());

	}

}
