package preprogramingM1;

public class FactorsNUmber {

	public static void main(String[] args) {
		
		int a = 10;
		
		System.out.print("Factor of number " + a + " ");
		
		for(int i =1; i<=a;i++) {
			if(a % i == 0)
			{
				System.out.print(i + "  ");
			}
				
			}
		
	}



}
