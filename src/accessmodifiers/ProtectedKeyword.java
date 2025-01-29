package accessmodifiers;

public class ProtectedKeyword {

	protected int i = 78;

	protected void m1() {
		System.out.println("Protected method");
	}

	public static void main(String[] args) {

		ProtectedKeyword pk = new ProtectedKeyword();

		System.out.println(pk.i);
		pk.m1();

	}

}
