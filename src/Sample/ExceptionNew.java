package Sample;

class UserException extends Exception {

	public UserException(String s) {
		super(s);
	}
}

public class ExceptionNew {

	public static void main(String[] args) throws Exception {

		int a = 10;
		int b = 90;
		/*
		 * if(a<b) throw new Exception("A is less than B"); else //throw new
		 * Exception("B is less than A"); throw new ArithmeticException();
		 */
		/*
		 * if (a < b) throw new UserException("A is less than B");
		 */
		try {
			if(a<b)
				throw new UserException("A is less than B");
		}catch(UserException e) {
			System.out.println(e);
		}
	}

}
