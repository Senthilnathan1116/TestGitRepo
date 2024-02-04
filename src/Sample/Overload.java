package Sample;

public class Overload {

	public static void main(String ar[]) {
		Overload obj = new Overload();
		obj.method();
		obj.method(1);
		obj.method(10, 20);
		obj.method(30, "Senthil");
		obj.method("senthil","Nathan");
		obj.method("senthil", 'R', "Nathan");
	}
	
	public void method() {
		System.out.println("Method with no arguments");
	}
	
	public void method(int a) {
		System.out.println("method with 1 integer value : " + a);
	}
	
	public void method(int a, int b) {
		System.out.println("method with 2 integer values : " + a + " " + b);
	}
	
	public void method(int a, String b) {
		System.out.println("method with integer & String values : " + a + " " + b);
	}
	
	public void method(String a, String b) {
		System.out.println("method with 2 String values : " + a + " " + b);
	}
	
	public void method(String a, char c, String s) {
		System.out.println("method with int String and char values : " + a + " " +  c + " " + s);
	}
}
