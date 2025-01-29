    /* Q1] store opning balance of an account  as 2500 and perform following operation 
          A] withdraw 250
          B] deposit 300
          C] deposit 250
           D] display balance
*/

package variable;

public class VariableExample1 {

	public static void main(String[] args) {
		
		int openingBalance = 2500;
		System.out.println("Balance in account  " + openingBalance);
		
		//withdraw 250
		openingBalance = openingBalance -250;
		System.out.println("After withdraw 250 :" + openingBalance);
		
		// deposit 300
		openingBalance = openingBalance + 300; 
		System.out.println("After deposite 300 :"+ openingBalance);
		
		
		// deposit 250
		openingBalance = openingBalance + 250; 
		System.out.println("Balance in account "+ openingBalance);
	}

}
