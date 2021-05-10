package drivers2;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			System.out.println("vehicle is Bus!!!");
		}
		else if(vehicle instanceof Taxi) {
			System.out.println("vehicle is Taxi!!!");
		}
		else {
			System.out.println("vehicle is Unknown!!!");
		}
	}
}
