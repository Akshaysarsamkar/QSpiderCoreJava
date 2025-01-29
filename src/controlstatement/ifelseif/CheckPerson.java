package controlstatement.ifelseif;

public class CheckPerson {

	public static void main(String[] args) {

		int age = 78;
		
		if(age <= 12 && age > 0 ) {
			System.out.println("Your Child");
		}else if(age <= 19 && age >= 13 ) {
		System.out.println("Your Teen");	
		}else if(age <= 59 && age >= 20) {
			System.out.println("Your Younger");
		}else if(age > 60) {
			System.out.println("Your Senior");
		}
	}

}
