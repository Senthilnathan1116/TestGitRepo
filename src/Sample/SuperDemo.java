package Sample;

class BaseA {

	int x;

	BaseA(int x) {
		this.x = x;
	}

	public int area() {
		return this.x * this.x;
	}

}

class BaseB extends BaseA {

	BaseB(int x) {
		super(x);
		System.out.println(super.x);
	}
	
	public void callArea() {
		super.x = 10;
		System.out.println(super.area());
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		new BaseB(5).callArea();
	}
}
