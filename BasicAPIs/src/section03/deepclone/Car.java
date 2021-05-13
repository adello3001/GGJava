package section03.deepclone;

public class Car implements Cloneable {
	public String model;
	
	public Car(String model) {
		this.model = model;
	}
	
	public Car getCar() {
		Car clonedCar = null;
		
		try {
			clonedCar = (Car)clone();
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Car Object is not supported");
		}
		return clonedCar;
	}	
}
