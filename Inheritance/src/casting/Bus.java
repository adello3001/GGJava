package casting;

public class Bus extends Vehicle {
	int station;
	
	@Override
	public void run() {
		System.out.println("버스가 달린다.");
		station++;
	}
	
	int getStation() {
		return station;
		
	}
}
