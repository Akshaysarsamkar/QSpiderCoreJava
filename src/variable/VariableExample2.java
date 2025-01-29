/*
 2] Paytem wallet 
     A] deposite 500
     B] deposite 250
     C] transfer 150
     D] display paytem wallet balance 

 */

package variable;

public class VariableExample2 {
	public static void main(String[] args) {
		int walletBalance = 0;
		
		// deposite 500
		walletBalance = walletBalance + 500;
		
		//deposite 250
		walletBalance = walletBalance + 250;

		//transfer 150
		walletBalance = walletBalance - 150;
		
		//display paytem wallet balance 
		System.out.println(walletBalance);

		
	}

}
