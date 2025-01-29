package opps;

import java.util.Scanner;

public class BagDriver {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Bag bag = new Bag();
		boolean exit = true;

		while (exit) {
			System.out.println();
			System.out.println("Enter Your Choice");
			System.out.println("1]AddBall \n2]Remove Ball \n3]IsBagEmpty \n4]showGame \n5]Exit");
			int ch = scanner.nextInt();

			switch (ch) {

			case 1:

				bag.addBall(new Ball());
				break;

			case 2:
				bag.removeBall();
				break;

			case 3:
				bag.empty();
				break;

			case 4:
				bag.showGame();
				break;

			case 5:
				exit = false;
				break;

			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
