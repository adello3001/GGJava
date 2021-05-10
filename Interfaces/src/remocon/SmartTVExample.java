package remocon;

public class SmartTVExample {

	public static void main(String[] args) {
		RemoteControl smarttv = new SmartTV();

		// 인터페이스 확장(default method)
		smarttv.setChannel(11);
		
		RemoteControl.control(smarttv);
	}
}
