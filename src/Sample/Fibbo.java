package Sample;

public class Fibbo {

	public static void main(String arg[]) {

		int a = 0;
		int b = 1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 3; i <= 13; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
			
		}
	}

}
