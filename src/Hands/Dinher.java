package Hands;

class Base {

	int i;
	int j;

	public Base() {
		i = 10;
		j = 10;
	}

	public void add() {
		int sum = i + j;
		System.out.println(sum);
	}
}


public class Dinher extends Base{

	 public void add1() {
		int div = i/j;
		System.out.println("Div : " + div);
	}
	public static void main(String[] args) {
		
		Dinher b = new Dinher();
		int mul = b.i * b.j;
		System.out.println("mul : " + mul);
		b.add();
	}

}
