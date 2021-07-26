package casting;

public class DriverExample3 {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Bus());
		driver.drive(new Taxi());
		driver.drive(new Truck());
	}
}
