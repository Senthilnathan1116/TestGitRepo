package Sample;

public class Prime {

	public static void main(String[] args) {
		
		for(int i=2;i<=50;i++) {
			int f = 0;
			for(int j=2;j<i;j++) {
				if((i%j)==0)
					f = 1;
			}
			if(f==0) {
				System.out.println(i + " is Prime no");
			}
		}

	}
}
