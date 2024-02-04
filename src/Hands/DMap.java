package Hands;

import java.util.*;
import java.util.Map.Entry;

public class DMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<>();
		
		m.put(1, "One");
		m.put(2,  "two");
		m.put(3, "three");
		m.put(4,  "four");
		m.put(5, "five");
		m.put(6,  "six");
		m.put(7, "Seven");
		m.put(8,  "eight");
		m.put(10, null);
		
		
		System.out.println("Size : " + m.size());
		System.out.println(m.get(2));
		System.out.println("Key : " + m.containsKey(7));
		System.out.println("Value : " + m.containsValue("threes"));
		List<String> ls = new ArrayList<>();
		ls.addAll(m.values());
		for(int i = 0; i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		
		
		for (Entry<Integer, String> e : m.entrySet()) 
			  
            // Printing key-value pairs 
            System.out.println(e.getKey() + " "
                               + e.getValue()); 
		m.remove(11);
		
	}
	

}
