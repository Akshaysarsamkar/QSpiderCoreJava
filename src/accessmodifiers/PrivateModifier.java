package accessmodifiers;

public class PrivateModifier {

	private static int i = 78;
	private int j = 45;

	private static void m1() {
		System.out.println("privat Static method");
	}

	private  void m2() {
		System.out.println("Private non-static method");
	}

	public static void main(String[] args) {

		System.out.println(i);
		m1();
		PrivateModifier pm = new PrivateModifier();
		pm.m2();
		System.out.println(pm.j);

	}

}
