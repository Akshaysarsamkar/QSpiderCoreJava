package controlstatement.ifelse;

public class CheckPassword {

	public static void main(String[] args) {

		String PASS = "Pass@2001";

		String enteredPass = "Pass@2141";

		if (PASS == enteredPass) {
			System.out.println("Entered password is correct........");
		} else {
			System.out.println("Entered password is wrong..........");
		}

	}

}
