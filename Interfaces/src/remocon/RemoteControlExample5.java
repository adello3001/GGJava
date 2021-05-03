package remocon;

public class RemoteControlExample5 {

	public static void main(String[] args) {
		Searchable stv = new SmartTelevision();
		
		Searchable searchable = (Searchable)stv;
		searchable.search("ezgava.com");
		
		RemoteControl rc = (RemoteControl)stv;
		rc.turnOn();
		rc.setVolumn(15);
		rc.turnOff();
	
	}
}
