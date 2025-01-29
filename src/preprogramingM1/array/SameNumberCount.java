package preprogramingM1.array;

import java.util.Iterator;

public class SameNumberCount {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 3, 2, 2, 2, 3, 3, 3, 3, 3, 9, 5,7 };

		for (int i = 0; i < a.length; i++) {
			int count = 1;

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = Integer.MAX_VALUE;
					
				}
			}
						
			if (a[i] != Integer.MAX_VALUE) {
				System.out.println(a[i] + " => " + count);
			}
		}
		
		


	}

}
