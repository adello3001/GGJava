package remocon;

public class RemoteControlExample4 {

	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		
		Searchable searchable = (Searchable)stv;
		searchable.search("ezgava.com");
		
		RemoteControl rc = (RemoteControl)stv;
		rc.turnOn();
		rc.setVolumn(15);
		rc.turnOff();
	
	}
}
