package exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {

		try {

			System.out.println(12 / 0);
			String string = null;
			System.out.println(string.toUpperCase());
			String s1 = "abcd";
			System.out.println(s1.charAt(7));

		} catch (ArithmeticException e) {
			System.out.println("Does not divided By zero");
		} catch (NullPointerException e) {
			System.out.println("Not Perform Operation on Null Reference String");
		} catch (Exception e) {
			System.out.println("Some thing was Wrong.....");
		}

	}

}
