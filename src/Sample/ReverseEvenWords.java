package Sample;

public class ReverseEvenWords {

	public static void main(String args[]) {
		ReverseEvenWords.approach1();
		ReverseEvenWords.approach2();
	}

	public static void approach1() {
		String s = "I am a software tester";
		String[] s1 = s.split(" ");
		String t = "";

		for (int i = 0; i < s1.length; i++) {

			if ((i % 2) != 0)
				t = t + ReverseEvenWords.reverse(s1[i]) + " ";
			else
				t = t + s1[i] + " ";
		}
		System.out.println("Final : " + t);
	}

	public static String reverse(String ss) {

		int l = ss.length();
		String s = "";
		for (int i = l - 1; i >= 0; i--)
			s = s + ss.charAt(i);

		return s;
	}

	public static void approach2() {
		String s = "I am a software tester";
		String[] s1 = s.split(" ");
		String t1 = "";
		for (int i = 0; i < s1.length; i++) {

			String t;
			
			if ((i % 2) != 0) {
				int l = s1[i].length();
				char[] s2 = new char[l];
				int n = 0;
				for (int j = l - 1; j >= 0; j--) {
					s2[n] = s1[i].charAt(j);
					n++;
				}
				t = new String(s2);
				t1 = t1 + t + " ";
			} else {
				t1 = t1 + s1[i] + " ";
			}
			
		}
		System.out.println("Final : " + t1);
	}
}
