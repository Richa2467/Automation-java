package Day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//declaration
//		Map hm=new HashMap();
//		HashMap hm=new HashMap();
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		
		
		//Adding pairs
		
		hm.put(101, "Ram");
		hm.put(101, "Siya");
		hm.put(103, "hanuman");
		
		System.out.println(hm);
		
		//Size of hashmap
		System.out.println(hm.size());
		
		//remove pair
		hm.remove(103);
		System.out.println(hm);
		
		//access value of particular key
		System.out.println(hm.get(101));
		hm.put(103, "hanuman");
		hm.put(102, "Shiva");
		
		//get all the keys from the Hashmap
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		
		//Reading data from hashmap
		
		//using for..Each
		for(int k:hm.keySet())
		{
			System.out.println(k+ " "+hm.get(k));
		}
		
		
		//Using Iterator
		
		Iterator<Entry<Integer,String>>it=hm.entrySet().iterator();
		
		while(it.hasNext())
		{
		Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
		
		//Clear
		hm.clear();
		System.out.println(hm.isEmpty());
		
		

	}

}
