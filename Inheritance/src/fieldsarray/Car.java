package fieldsarray;

public class Car {
	Tire[] tires = {
			new Tire("앞왼쪽 바퀴", 6),
			new Tire("앞오른쪽 바퀴", 2),
			new Tire("뒤왼쪽 바퀴", 3),
			new Tire("뒤오른쪽 바퀴", 4)
	};
	
	int run() {
		System.out.println("[자동차가 달림]");
		
		for(int i=0; i < tires.length; i++) {
			Tire tire = tires[i];
			if(tire.roll() == false) {
				stop();
				return (i+1);
			}
		}
		
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춤]");
	}
	
	String getLocation(int loc) {
		if(loc >= 1 && loc <= 4) {
			Tire tire = this.tires[loc-1];
			return tire.location;
		}
		
		return null;
	}
	
	void changeTire(Tire tire, int loc) {
		System.out.println(tire.location + "교체");
		if(loc >= 1 && loc <= 4) {
			this.tires[loc-1] = tire;
		}
	}
}
