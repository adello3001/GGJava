package drivers2;

public class Bus extends Vehicle {
	int station;
	
	@Override
	public void run() {
		System.out.println("������ �޸���.");
		station++;
	}
	
	int getStation() {
		return station;
		
	}
}
