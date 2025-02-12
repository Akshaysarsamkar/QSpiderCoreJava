package importconcept;

abstract class Super{
	// public static final void get();  // not allow public ststic final method 
	
	// public abstract final void get();  // final abstract method also not allow 
	
   // public final abstract void get();  // not allow final abstract method
	
   public final void get() { 
	   System.out.println("finally");
   }
}

public class AbstactclassimportConcept extends Super{
	
	public static void main(String[] args) {
		
		
		
	}

	

}
