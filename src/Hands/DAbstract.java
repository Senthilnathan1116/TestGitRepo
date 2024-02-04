package Hands;

abstract class Test{
	public void display() {
		System.out.println("display");
	}
	abstract void display1();
}
public class DAbstract extends Test {
	
	public void display1() {
		System.out.println("Display1");
	}
	public static void main(String ar[]) {
		DAbstract obj = new DAbstract();
		obj.display();
		obj.display1();
	}
}
