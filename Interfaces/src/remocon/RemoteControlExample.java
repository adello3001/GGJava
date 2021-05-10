package remocon;

public class RemoteControlExample {

	public static void main(String[] args) {
		System.out.println("RemoteControl.MAX_VALUE:" + RemoteControl.MAX_VALUE);
		System.out.println("RemoteControl.MIN_VALUE:" + RemoteControl.MIN_VALUE);
		System.out.println("RemoteControl.RC_VALUE:" + RemoteControl.RC_VALUE);

		RemoteControl.changeBattery();
	}
}
