package Sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collections_Map {

	public static void main(String[] args) {
		
		Map<Integer, String> emp = new HashMap<>();
		
		emp.put(1, "Senthil");
		emp.put(2,  "Ramya");
		emp.put(3,  "Kamali");
		
		System.out.println(emp.size());
		System.out.println(emp);
		emp.put(3,  "Nathan");
		System.out.println(emp);
		
		System.out.println(emp.get(3));
		System.out.println();
		if(emp.containsKey(3))
			System.out.println(emp.get(3));
		else
			System.out.println("Key not found");
		
		System.out.println(emp.containsValue("Nathan"));
		
		System.out.println(emp.keySet());
		
		List<String> values = new ArrayList<>();
		values.addAll(emp.values());
		System.out.println(values);
		System.out.println();
		Set<Entry<Integer, String>> entrySet = emp.entrySet();
		System.out.println(entrySet);
		
		for(int k: emp.keySet())
			System.out.println(emp.get(k));
		
		
	}
}
