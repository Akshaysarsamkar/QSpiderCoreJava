package interfaceexample;

interface l1 {
	abstract void t1();

	abstract void t2();

	static void t3() {
		System.out.println("static method in l1 interface ");
	}
}

public interface SingleLevel extends l1 {

	public static void main(String[] args) {
		l1.t3(); // not inherited
		// SingleLevel.t3(); // not allow
	}

}
