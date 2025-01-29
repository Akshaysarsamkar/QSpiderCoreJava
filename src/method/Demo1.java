package method;

public class Demo1 {

	public static void sita() {
		System.out.println("hi..! From sita()");
	}

	public static void ram() {
		System.out.println("Ram Begins");
		sita();
		System.out.println("Ram Ends");
	}

	public static void main(String[] args) {
		System.out.println("Main Begins");
		ram();
		sita();
		System.out.println(" Main Ends ");
	}

}
