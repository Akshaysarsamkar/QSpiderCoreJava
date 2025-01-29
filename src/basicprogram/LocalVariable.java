package basicprogram;

public class LocalVariable {

	// int a; // local varariable can not declare or initilize in class block 
	
	public static void main(String[] args) {

	// int a ; // not have default value 
	//	System.out.println(a);  // not used without initialization 
		
		int i = 20;
		System.out.println(i);
		
		{
			int z = 85;
			System.out.println("Inside Block value of Z is : " + z);
			System.out.println("value of i is : " + i); // allow to access local variable inside nested block  
		}
		
		//System.out.println("try to access the z outside the block where it declare z : " + z); // not access outside block where it declare 
		
		
	}

}
