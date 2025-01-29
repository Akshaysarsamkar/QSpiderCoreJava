package Oprator;

public class LogicalOperator {

	public static void main(String[] args) {

		int a = 50;
		int b = 60;
		int c = 45;

		// && And Operator
		System.out.println((a > b) && (b < c));   // False
						//  50 > 60 = F  -> and operator first condition false it will no check second one 

		// || or Operator
		System.out.println((a > b) || (b < c)); // False
						//	(50 > 60) || ( 60 < 45 ) 
		                   // F || F => F 
		
		
		// ! not operator
		System.out.println(!(c > a)); // True
					   // !(45 > 50)  
                       // False ====>
		
		System.out.println((a < b &&  b>c) ||  (c<b || a>b)); // True
		              //     ( 50 < 60 && 60 > 45 ) || (45  < 60 || 50>60)
		              //          T && T  || T || F
		              //            T || T 
		              // T
	} 

}
