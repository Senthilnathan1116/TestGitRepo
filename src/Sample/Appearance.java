package Sample;

/*
 * Given an integer array nums, return true if any value appears at least 
 * twice in the array, and return false if every element is distinct.
 */
public class Appearance {

	public static void main(String[] args) {
		// int[] a = { 2, 2, 1, 3, 3, 2, 3, 3 ,3};
		int[] a = { 4, 3, 5, 1 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		int f = 0;
		for (int i = 0; i < a.length; i++) {
			int c = 1;

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					c++;
			}

			if (c > 1) {
				System.out.println("true");
				f = 1;
				break;
			}

			i = i + c - 1;
		}
		if (f == 0)
			System.out.println("false");

	}

}
