package Sample;

public class Strings {

	public static void main(String[] args) {

		String s1 = "senthilnathan";
		String s2 = "Ramya";
		String s3 = "Kamalika ";

		
		/*
		 * int len = s1.length(); System.out.println("length of " + s1 + " " + len);
		 * String substring = s1.substring(7); System.out.println("Substring of " + s1 +
		 * ": " + substring);
		 * 
		 * String s4 = s2 + s1.substring(7); System.out.println(s4); String s5 =
		 * s3.concat(s1); System.out.println(s5); System.out.println(s1.toUpperCase());
		 * System.out.println(s1.indexOf('a')); System.out.println(s1.indexOf("na"));
		 * System.out.println(s1.indexOf('a', 9));
		 * System.out.println(s1.lastIndexOf('n'));
		 * System.out.println(s1.lastIndexOf('n', 5)); System.out.println(s1.charAt(6));
		 */
		
		/*
		 * String s = "";
		 * 
		 * if(s.isBlank()) { System.out.println("blank"); }
		 * 
		 * if(s.isEmpty()) { System.out.println("emtpy"); }
		 * System.out.println(s1.replace('n', 'B'));
		 */
		/*
		 * String[] n = s1.split("n"); for(String c:n) System.out.println(c);
		 */
		
		boolean b1 = true;
		boolean c1 = false;
		
//		System.out.println(String.valueOf(b1)+s1);
		
        byte b2=11;    
        short sh = 12;  
        int i = 13;  
        long l = 14L;  
        float f = 15.5f;  
        double d = 16.5d;  
        char chr[]={'j','a','v','a'};
        
        System.out.println(String.valueOf(b2));
        System.out.println(String.valueOf(sh));
        System.out.println(String.valueOf(i));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(f));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(chr));
	}

}
