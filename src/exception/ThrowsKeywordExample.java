package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeywordExample {

	public static void main(String[] args) throws NullPointerException {
		m1();
	}

	public static void m1() throws NullPointerException {

		String s1 = null;
		System.out.println(s1.toUpperCase());

	}

}
