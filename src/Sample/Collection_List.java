package Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection_List {

	public static void main(String[] args) {

		List<String> name = new ArrayList<>();
		name.add("senthil");
		name.add("Kamali");
		name.add("senthil");
		name.add("Kamali");
		name.add("Ramya");
		name.add("Nathan");

		int dup = 1;
		String n = "";
		Collections.sort(name);

		for (int i = 0; i < name.size(); i++) {
			int c = 1;
			for (int j = i + 1; j < name.size(); j++) {
				if (name.get(i).equalsIgnoreCase(name.get(j))) {
					c++;
					dup++;
					n = name.get(i);
				} else
					break;
			}
			if (c > 1)
				System.out.println(name.get(i) + " Appears " + c + " Times");
			i = i + c - 1;
		}
		if (dup > 1)
			System.out.println("list contains duplicate values");
		else
			System.out.println("No duplicate values in list");

		for (String s : name) {
			System.out.println(s);
		}
		System.out.println("***********************");
		//name.remove(2);
		System.out.println(name.indexOf("senthil"));
		System.out.println(name.contains("senthil"));
		System.out.println(name);
		//name.clear();
		System.out.println(name);
		Collections.shuffle(name);
		System.out.println(name);
		
		System.out.println("Unique values\n******************");
		Set<String> unique = new HashSet<>();
		unique.addAll(name);
		name.clear();
		name.addAll(unique);
		System.out.println(name);
		
		
	}
}
