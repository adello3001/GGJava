package remocon;

public class SmartTelevisionExample5 {

	public static void main(String[] args) {
		Searchable stv = new SmartTelevision();
		stv.search("LG");
		
		Searchable searchable = (Searchable)stv;
		searchable.search("ezjava.com");

		RemoteControl rc = (RemoteControl)stv;
		rc.turnOn();
		rc.setVolumn(15);
		rc.turnOff();
	}
}
