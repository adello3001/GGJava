package remocon;

public class RemoteControlExample3 {

	public static void main(String[] args) {
		RemoteControl tv = new Television("»ï¼º");
		RemoteControl audio = new Audio();

		RemoteControl.control(tv);
		RemoteControl.control(audio);
		RemoteControl.control(new Television("LG"));
	}
}
