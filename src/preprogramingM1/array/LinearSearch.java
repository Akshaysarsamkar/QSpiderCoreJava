package preprogramingM1.array;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[] = {45,87,56,95,12,32};
		
		int num = 66;
		boolean f = false;
		for(int i = 0;i<a.length-1;i++) {
			if(a[i] == num) {
				f = true;
				break;
			}
		}
		
		if(f) {
			System.out.println(num  + " is found in array");
		}else {
			System.out.println(num  + " is not found in array");

		}

	}

}
