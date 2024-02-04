package Sample;

interface inter {

	int a = 10;

	public void test();

	public void display();
	
	static int area(int a) {
		return a*a;
	}
}

interface inter01 extends inter {
	int c = a + 20;

	public void test1();
}

abstract class AbsInter {

	int b = 10;

	abstract void new1();

}

class InterChild extends AbsInter implements inter, inter01 {

	public void test() {
		System.out.println("test");
	}

	public void display() {
		System.out.println("display");
	}

	public void new1() {
		System.out.println("New1");
		System.out.println(a + b);
	}

	public void test1() {
		System.out.println("c=" + c);
	}
}

public class InterfaceClass {

	public static void main(String[] args) {
		InterChild c = new InterChild();
		c.test();
		c.display();
		c.new1();
		System.out.println("a=" + c.a);
		System.out.println(inter.area(4));
	}
}
