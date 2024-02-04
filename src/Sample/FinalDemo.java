package Sample;

class Fin {

	public final int a;

	Fin() {
		a = 10;
	}

	public void display() {
		System.out.println("final demo");
	}

	public final void disp() {
		System.out.println("CTS");
	}
}

class Fin1 extends Fin {

	public void display() {
		System.out.println("TCS");
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		Fin f = new Fin();
		// f.di
	}
}
