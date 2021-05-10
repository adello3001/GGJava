package fieldsarray;

public class CarExample2 {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			if(problemLocation != 0) {
				String location = car.getLocation(problemLocation); 
				car.changeTire(new HankookTire(location, 15), problemLocation);
			}
			System.out.println("----------------------------------------");
		}
	}
}
