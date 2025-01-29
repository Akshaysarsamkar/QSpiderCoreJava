package accessmodifiers;

public class ProtectedKeyword1 extends ProtectedKeyword {

	public static void main(String[] args) {

		ProtectedKeyword pk = new ProtectedKeyword();

		System.out.println(pk.i);
		pk.m1();

	}

}
