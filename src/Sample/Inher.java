package Sample;

class Base {

	int a;

	public void display() {
		System.out.println("Base class");
	}

	public static void test(String s) {
		System.out.println(s);
	}
}

class Child1 extends Base {
	public void displayChild() {
		System.out.println("Child1");
		a = 10;
		System.out.println(a);
		Base.test("calling from child1");

	}
}

class Grand extends Child1 {

	public void grand() {
		System.out.println("Grand");
	}

}

class Child2 extends Base {
	public void displayChild() {
		System.out.println("Child2");
		a = 10;
		System.out.println(a);
		Base.test("calling from child2");

	}
}

public class Inher {

	public static void main(String[] args) {

		/*
		 * Child1 ob = new Child1(); ob.displayChild(); ob.display();
		 * Base.test("calling from main");
		 */

		Child2 ob2 = new Child2();
		ob2.displayChild();
		ob2.display();
		/*
		 * Grand g = new Grand(); g.grand(); g.displayChild(); g.display();
		 */
	}

}
