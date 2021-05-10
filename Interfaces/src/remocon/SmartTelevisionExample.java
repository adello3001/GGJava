package remocon;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		stv.search("ezjava.com");
		stv.turnOn();
		stv.setVolumn(15);
		stv.turnOff();
	}
}
