package casting;

public class Bus extends Vehicle {
	int station;
	
	@Override
	public void run() {
		System.out.println("버스가 달린다.");
		station++;
	}
	
	public void run(int station) {
		System.out.println("버스가 달린다." + station);
		this.station += station;
	}

	
	int getStation() {
		return station;
	}
}
