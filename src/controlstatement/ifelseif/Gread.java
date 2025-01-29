package controlstatement.ifelseif;

public class Gread {

	public static void main(String[] args) {

		int mark = 78;

		if (mark >= 90 && mark <= 100) {
			System.out.println("Gread : A");
		} else if (mark >= 70 && mark <= 89) {
			System.out.println("Gread : B");
		} else if (mark >= 50 && mark <= 69) {
			System.out.println("Gread : c");
		} else if (mark >= 50) {
			System.out.println("Gread : d");
		} else {
			System.out.println("Fail...........");

		}

	}

}
