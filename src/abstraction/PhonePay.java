package abstraction;

// abstract class 
public abstract class PhonePay {

	// abstract methods
	public abstract void sendMoney(long password, float amount, long number);

	public abstract void doRecharge(long password, float amount, long number);

	// non-static method
	public void m1() {
		System.out.println("Final method..........");
	}

	// static method
	public static void m2() {
		System.out.println("Final method..........");
	}

}
