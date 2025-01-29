package method;

public class Program1 {

	public static void main(String[] args) {

          add(10,54);
          sub(54,10);
          add(63,45);
	}

	public static void sub(int i, int j) {
    System.out.println("Subtraction is " + (i-j));
	}

	public static void add(int i, int j) {
	    System.out.println("Addition is " + (i+j));
	}

}
