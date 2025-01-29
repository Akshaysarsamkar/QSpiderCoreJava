package preprogramingM1;

public class TotalFactor {

	public static void main(String[] args) {

		int num = 52;
		int i = 1;
		int c = 0;
		while (i <= num) {
			if (num % i == 0) {
				c++;
			}
			i++;
		}

		System.out.println("Total no of factor : " + c);

	}

}
