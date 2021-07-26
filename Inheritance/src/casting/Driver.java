package casting;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			System.out.println("vehicle is Bus!!!");
			Bus bus = (Bus)vehicle;
			bus.run(2);
		}
		else if(vehicle instanceof Taxi) {
			System.out.println("vehicle is Taxi!!!");
			vehicle.run();
			// Taxi taxi = (Taxi)vehicle;
			// taxi.run(2);
		}
		else {
			System.out.println("vehicle is Unknown!!!");
			vehicle.run();
		}
	}
}
