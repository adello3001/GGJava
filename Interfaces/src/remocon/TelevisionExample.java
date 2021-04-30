package remocon;

public class TelevisionExample {

	public static void main(String[] args) {
		RemoteControl tv = new Television();
		
		tv.turnOn();
		tv.setVolumn(5);
		tv.turnOff();
	}
}
