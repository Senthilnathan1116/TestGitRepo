package Hands;

import java.util.*;

public class DList {

	public static void main(String ar[]) {

		List<String> name = new ArrayList<>();
		List<String> color = new ArrayList<>();
		name.add("Senthil");
		name.add("kamali");
		name.add("Ramya");
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}
		name.add("Bag");
		name.add("bat");
		name.add(null);
		name.add(null);
		System.out.println("=====================");
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}
		System.out.println("=====================");
		name.remove("bat");
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}
		System.out.println(name.contains("Senthil"));
		if (name.contains("Senthil"))
			name.remove("Senthil");

		System.out.println("=====================");
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}
		color.add("Red");
		color.add("yello");
		color.add("Pink");
		color.add("green");
		name.addAll(color);
		System.out.println("=====================");
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}
		Iterator<String> itr = name.iterator();
		System.out.println("******************");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=====================");
		name.remove("Red");
		/*
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 */
		System.out.println("=====================");
		name.clear();
		System.out.println(name.size());
	}

}
