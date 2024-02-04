package Sample;

public class Palindrom {

	public static void main(String args[]) {
		String a = "b";
		String b = "";

		int len = a.length();
		int c = len / 2;
		int f = 0;
		for (int i = 0; i < c; i++) {
			if (a.charAt(i) != a.charAt(--len))
				f = 1;
		}
		if(f==0)
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
	}

}
