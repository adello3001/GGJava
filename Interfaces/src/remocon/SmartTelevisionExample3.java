package remocon;

public class SmartTelevisionExample3 {

	public static void main(String[] args) {
		Searchable stv = new SmartTelevision();
		
		stv.search("ezjava.com");
		
		// The method search(String) is undefined for the type RemoteControl
		// stv.turnOn();
		// stv.setVolumn(15);
		// stv.turnOff();
	}
}
