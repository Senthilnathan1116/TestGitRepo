package Sample;

public class UpperLower {

	public static void main(String args[]) {
		String s = "TeSt ChArAcTeR";
		char[] s1 = new char[s.length()];
		s1 = s.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			//System.out.println(s1[i]);
			if(Character.isLowerCase(s1[i])) {
				s1[i]=Character.toUpperCase(s1[i]);
			}
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
	}	
}
