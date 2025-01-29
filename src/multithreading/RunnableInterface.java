package multithreading;

public class RunnableInterface {

	public static void main(String[] args) {

		MyThread1 myThread1 = new MyThread1();

		Thread thread = new Thread(myThread1);

		thread.start();
		
		for (int i = 0; i < 4; i++) {
			System.out.println(Thread.currentThread().getName()+ "::A0"
					+ "");
		}

	}
}

class MyThread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println(Thread.currentThread().getName()+ "::A1");
		}
	}

}
