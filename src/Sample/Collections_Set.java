package Sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections_Set {
	public static void main(String[] args) {
		
		Set<String> name = new HashSet<>();
		name.add("senthil");
		name.add("senthil");
		name.add("Kamali");
		name.add("senthil");
		name.add("Kamali");
		name.add("Ramya");
		name.add("Nathan");
		name.add(null);
		
		List<String> nameString = new ArrayList<>();
		nameString.addAll(name);
		System.out.println("Hashset\n" + name);
		
		Set<String> name1 = new TreeSet<>();
		name1.add("senthil");
		name1.add("senthil");
		name1.add("Kamali");
		name1.add("senthil");
		name1.add("Kamali");
		name1.add("Ramya");
		name1.add("Nathan");
		//name1.add(null);
		
		List<String> nameString1 = new ArrayList<>();
		nameString1.addAll(name1);
		System.out.println("Treeset\n" + name1);
		
		Set<String> name2 = new LinkedHashSet<>();
		name2.add("senthil1");
		name2.add("senthil2");
		name2.add("Kamali3");
		name2.add("senthil4");
		name2.add("Kamali5");
		name2.add("Ramya6");
		name2.add("Nathan7");
		//name1.add(null);
		
		
		List<String> nameString2 = new ArrayList<>();
		nameString2.addAll(name2);
		System.out.println("LinkedHashset\n" + name2);
	}

}
