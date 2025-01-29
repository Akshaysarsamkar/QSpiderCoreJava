package controlstatement.ifelseif;

public class MaxNumberOutOf3 {

	public static void main(String[] args) {

		int num1 = 78;
		int num2 = 65;
		int num3 = 21;

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " Max number out of 3 number");
		} else if (num2 > num3) {
			System.out.println(num2 + " Max number out of 3 number");

		} else {
			System.out.println(num3 + " Max number out of 3 number");

		}

	}

}
