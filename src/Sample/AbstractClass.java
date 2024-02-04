package Sample;

abstract class NewTest {

	int a;
	abstract void display();

	public void disp() {
		System.out.println("inside Abstract method");
	}
	
	public static void stat() {
		System.out.println("Static method inside abstract class");
	}
}

class Child11 extends NewTest{

	void display() {
		
		System.out.println("child class");
	}
	
}

class Child12 extends Child11{
	
	public void display() {
		System.out.println("Display Child12");
	}
	
}

public class AbstractClass {
	
	public static void main(String[] args) {
		
		Child12 ob = new Child12();
		ob.display();
		ob.disp();
		NewTest.stat();
	}

}
