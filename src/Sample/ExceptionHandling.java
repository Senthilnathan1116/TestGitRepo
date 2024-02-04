package Sample;

public class ExceptionHandling {

	static int a, b, c;
	static String s;

	public static void main(String[] args) {
		s = null;
		try {
			a = 10;
			b = 0;
			//c = a / b;
			//System.out.println(s.length());
			try {
				c=a/b;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("inner try block");
				System.out.println(e);
			}
			//c=a/b;
			
		} catch (ArithmeticException e) {

			System.out.println("Divided by Zero");
			c = a / 10;
			System.out.println(c);

		} catch (NullPointerException e) {
			System.out.println("null exception");
		} finally {
			System.out.println("end");
		}

	}

}
