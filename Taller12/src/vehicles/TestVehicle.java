package vehicles;

public class TestVehicle {

	public static void main(String[] args) {

		System.out.println("Manufacturer: " + Vehicle.MAKE);
		System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

		Vehicle vehicle1 = new Vehicle("Vision");
		System.out.println(vehicle1.toString());

		Vehicle vehicle2 = new Vehicle("Edict");
		System.out.println(vehicle2.toString());

		vehicle2.setMake("Seer");

		System.out.println(vehicle1.toString());
		System.out.println(vehicle2.toString());

		Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
		System.out.println("Vehicle number " + vehicle3.getChassisNo() + " is a " + vehicle3.getModel()
				+ " model and has an engine capacity of " + vehicle3.getCAPACITY() + "cc");

		System.out.println(NumberVehicles());
	}

	public static String NumberVehicles() {
		return "Number of vehicles manufactured: " + Vehicle.numVehicles;
	}
}
