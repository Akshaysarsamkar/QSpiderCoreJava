package exception;

public class FinallyBlockWithTry {

	public static void main(String[] args) {
		try {
			System.out.println(1 / 1);
		} finally {
			System.out.println("Finally Block With Try");
		}

	}

}
