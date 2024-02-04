package Sample;

public class Duplicate {

	public static void main(String args[]) {
		String s = "we learn java basics we as part of java sessions in java week1";
		String[] s1 = s.split(" ");
		String s2 = s;
		for (int i = 0; i < s1.length; i++) {
			String dummy = s1[i];
			int c = 0;
			for (int j = i + 1; j < s1.length; j++) {
				if (dummy.equalsIgnoreCase(s1[j]))
					c++;
			}
			if (c!=0)
				s2=s2.replace(dummy, "");
		}
		System.out.println("Final : " + s2);
	}
}
