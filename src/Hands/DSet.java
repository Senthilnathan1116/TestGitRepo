package Hands;

import java.util.*;

public class DSet {

	public static void main(String ar[]) {

		Set<String> s = new HashSet<>();
		s.add("Senthil");
		s.add("Ram");
		s.add("Kamali");
		s.add(null);
		s.add(null);
		s.add("Senthil");
		s.add("Ram");
		s.add("Kamali");
		System.out.println(s.size());
		
		System.out.println("****************************");
		List<String> ls = new ArrayList<>();
		ls.addAll(s);

		ls.remove(null);
		System.out.println(ls.size());
		Collections.sort(ls);

		Iterator<String> itr = ls.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
