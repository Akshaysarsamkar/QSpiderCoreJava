package preprogramingM1.string;

public class ReverseString {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "";
		System.out.println("Before reverse the String:  " + s1);
		System.out.print("After reverse the String:  ");
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
			s2 = s2 + s1.charAt(i);
		}
		System.out.println();
		System.out.println("After reverse the String:  " + s2);

	}

}
