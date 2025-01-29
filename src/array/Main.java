package array;

import preprogramingM1.Count_Digti;

class Main {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int sum = 0;
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 == 0) {
//
//				sum = sum + a[i];
//
//			}
//		}
//		System.out.println("Sum of even number: " + sum);
//
//		sum = 0;
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 != 0) {
//				sum = sum + a[i];
//			}
//		}
//		System.out.println("sum of odd numbere: " + sum);
		
		
		for(int i=0;i<a.length;i++) {
			int c = 0;
			for(int j=1;j<=a[i];j++) {
				
				if(a[i] % j == 0) {
					c++;
				}
				
			}
			
			if(c <= 2) {
				System.out.println(a[i] + " is prime number");
			}
		}

	}
}
