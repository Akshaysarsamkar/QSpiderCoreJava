package opps;

import java.util.Scanner;

public class Bag {

	Ball b = null;
	Scanner scanner = new Scanner(System.in);

	public void addBall(Ball b) {
		System.out.println("Choice the ball to add in bag");
		System.out.println("1]Basket Ball \n2]Tennis Ball");
		int ch = scanner.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter the Radius");
			int r = scanner.nextInt();
			BasketBall ball = new BasketBall();
			ball.setRadius(r);
			this.b = ball;
			System.out.println("Basket Ball Added succefully");
			break;
		case 2:
			System.out.println("Enter the Radius");
			int r1 = scanner.nextInt();
			TennisBall tBall = new TennisBall();
			tBall.setRadius(r1);
			this.b = tBall;
			System.out.println("Tennies Added succefully");

			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}

	public void removeBall() {
		if (b != null) {
			b = null;
			System.out.println("Ball Is Remove Succesfully!!!!");
		} else {
			System.out.println("Bag Is Already Empty");
		}
	}

	public void empty() {
		if (b == null) {
			System.out.println("Bag Is Empty");
		} else {
			System.out.println("Bag is not Empty");
		}
	}

	public void showGame() {

		if (b instanceof BasketBall) {
			System.out.println("Game is Basket Ball");
		} else if (b instanceof TennisBall) {
			System.out.println("Game Is Tennis Ball");
		} else {
			System.out.println("Game is Not selected");
		}
	}

}
