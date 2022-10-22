package vehicles;

public class Vehicle {

	public static String MAKE = "Augur";
	public static int numVehicles = 0;
	
	private String ChassisNo;
	private String model;
	
	public Vehicle(String model) {
	
		numVehicles++;
		
		this.model = model;
	}
	
	

}
