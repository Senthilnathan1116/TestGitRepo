package Sample;

class Class1 {

	public void method1() {
		System.out.println("Class 1 method1");
	}

	public void method2() {
		System.out.println("Class 1 method2");
	}
}

class Class2 extends Class1 {

	public void method1() {
		int a = 10 + 20;
		System.out.println(a);
	}
	
	public void method2(int c) {
		System.out.println("child method2 " + c);
	}
}

public class Overload2 {

	public static void main(String[] args) {
		Class2 ob = new Class2();
		ob.method1();
		ob.method2(100);
		ob.method2();
		Class1 obj = new Class1();
		// obj.method1();

	}
}
