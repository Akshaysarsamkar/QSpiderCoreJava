package preprogramingM1.array;

public class TuistedPrimeNumber {

	public static void main(String[] args) {

		System.out.println("Prime Tuisted numbr betweeen 1 to 100 : ");

		for (int i = 1; i <= 100; i++) {
			int count = 0;
			int t = i;


			for (int j = 1; j <= i; j++) {

				if (t % j == 0)
					count++;
			}
			int rev = 0;
			if(count == 2) {
				


				while(t > 0) {
					int rem = t %10;
					rev = rev * 10 + rem;
					t/=10;
				}
				
				


				int c = 0;
				for (int j = 1; j <= rev; j++) {

					if (rev % j == 0)
						c++;
				}
				
				if(c==2)
					System.out.print(i + " ");
				
			}
		}

	}
}
