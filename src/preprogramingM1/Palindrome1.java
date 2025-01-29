package preprogramingM1;
import java.util.*;
public class Palindrome1 {
	public static void main(String[] args) { 
		
		
		Scanner sc = new Scanner(System.in);
		
       System.out.println("Enter the number");
       int num = sc.nextInt();
       int rev = 0;
       int num1 = num;
       
       while(num > 0) {
    	   int rem = num % 10;
    	   if(rem != 1) {
              rev = rev * 10 + rem;
    	   }else {
    		   break;
    	   }
    	   num = num /10;
       }
       
       if(rev == num1) {
    	   System.out.println("Number is palindrome and not contains 1");
       }else {
    	   System.out.println("Number is Not palindrome");
       }
	}
}

