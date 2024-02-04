package NTest;

class TestClass {

	int a;
	int b;
	int c;

	TestClass() {
		System.out.println("Constructor called");
	}

	TestClass(String mes) {
		System.out.println("Parameterized Constructor value : " + mes);
	}

	TestClass(int x, int y) {
		this.a = x;
		this.b = y;
	}

	public TestClass setA(int a) {
		this.a = a;
		return this;
	}

	public TestClass setB(int b) {
		this.b = b;
		return this;
	}

	public TestClass setC(int c) {
		this.c = c;
		return this;
	}

	public int mulitiply() {
		return this.a * this.b;
	}

	public int addition() {
		return this.c + this.b;
	}
	static {
		System.out.println("Static block2");
	}
}

class TestStatic {

	static {
		System.out.println("Static block");
	}
}

public class Loopp {

	public static void main(String a[]) {

		System.out.println("Mulitplication : " + new TestClass().setA(10).setB(20).mulitiply());
		System.out.println("Addtion : " + new TestClass("Hello").setB(10).setC(20).addition());
		System.out.println("Para const : " + new TestClass(10, 300).mulitiply());

	}
}