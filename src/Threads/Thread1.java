package Threads;

class Multi1 extends Thread implements Runnable{
	public void run() {
		System.out.println("Start Thread1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Multi2 extends Thread implements Runnable{
	public void run() {
		System.out.println("Start Thread2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Thread1 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Multi1());
		Thread t2 = new Thread(new Multi2());
		for(int i=0;i<10;i++) {
			if(i%2==0) 
				t1.start();
			else 
				t2.start();
		}
	}
}
