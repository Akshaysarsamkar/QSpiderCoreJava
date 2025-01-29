package method;

public class HardExample {

	static int a;

	public static void main(String[] args) {
		a = 10;
		a = a++;
		System.out.println(a);
		m1();
		System.out.println(a);
	}
	public static void m1() {
		System.out.println(a);
		int a = 10;
		System.out.println(a);
	}

}
