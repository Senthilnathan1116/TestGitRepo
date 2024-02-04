package Sample;


/*
 * The majority element is the element that appears more than n / 2 times. 
 * You may assume that the majority element always exists in the array.
 */
public class Majority {

	public static void main(String[] args) {
		int[] a = { 2, 2, 1, 3, 3, 2, 3, 3 ,3};
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		int max = 0;
		int max_val = a[0];
		for (int i = 0; i < a.length; i++) {
			int c = 1;

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					c++;
			}

			if (c > max) {
				max_val = a[i];
				max = c;
			}
			i = i + c - 1;
		}
		System.out.println(max_val);
	}

}
