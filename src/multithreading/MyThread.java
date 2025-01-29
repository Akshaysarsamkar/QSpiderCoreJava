package multithreading;

class NewThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i <= 4; i++) {
			Thread.currentThread().setName("NewThread" + i);
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class MyThread {

	public static void main(String[] args) {

		NewThread newThread = new NewThread();

		newThread.start();

		System.out.println(Thread.currentThread().getName());

	}
}
