package Sample;

class TestA {

	int a;
	int b;

	TestA() {
		this(99,88);
		System.out.println("Const without para");
	}
	
	TestA(int y){
		this();
		System.out.println(y);
	}
	
	TestA(int x, int y){
		System.out.println(x + " " + y);
	}

	public void setA(int x) {
		this.a = x;
	}

	public void setB(int y) {
		this.b = y;
	}

	public int add() {
		return this.a + this.b;
	}

	public void d() {
		System.out.println("test");
	}

	static void d1() {
		new TestA().d();
	}

	static {
		System.out.println("Static block");
	}
}

public class Others {

	public static void main(String[] args) {
		TestA ob1 = new TestA();
		ob1.setA(10);
		ob1.setB(20);
		System.out.println(ob1.add());

		TestA ob2 = new TestA();
		ob2.setA(30);
		ob2.setB(40);
		System.out.println(ob2.add());
		System.out.println(ob1.a + ob2.a);
		TestA.d1();

	}

}
