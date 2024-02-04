package Sample;


class Test1 {
	
	static String s;
	
	public static void setS(String val) {
		s = val;
	}
	
	public String getS() {
		return s;
	}
	
	static {
		System.out.println("Static block");
	}
}
public class StaticEx {

	static int x = 10;
	static {
		System.out.println("Static block in class");
		x+=50;
	}
	public static void main(String a[]) {
		System.out.println(x);
		System.out.println("Main method");
		Test1 t = new Test1();
		Test1.setS("Senthil");
		System.out.println(t.getS());
		System.out.println(Test1.s);
	}
}
