package opps.inheritance;

public class Car_EngineDriver {
	
	public static void main(String[] args) {
		
		Car car = new Car("BMW","Model",8500000, new Engine("ED2","Silver", 45000));
		
		car.carDetails();
		car.e.engineDetails();
		
	}

}
