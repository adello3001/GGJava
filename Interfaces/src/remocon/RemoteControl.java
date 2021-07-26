package remocon;

public interface RemoteControl {
	// 상수: 관례적으로 대문자(public static final)
	public static final int RC_VALUE = 5;
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;
	
	// 자동으로 추상 메소드(abstract method)가 되므로 구현을 가질 수 없다.
	public void turnOn();
	public void turnOff();
	public void setVolumn(int volumn);
	
	/*
	 * 새로 추가(SmartTV 용)
	 * 1. 디폴트 메소드를 통해서 인터페이스를 확장
	 * 2. 하위 호환성을 유지
	*/
	default public void setChannel(int channel) {
		System.out.println("채널변경");
	}
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음모드");
		}
		else {
			System.out.println("무음해제");
		}
	}
	
	static void changeBattery() {
		System.out.println("배터리 교환");
	}
	
	static void control(RemoteControl rc) {
		rc.turnOn();
		rc.setMute(true);
		rc.setVolumn(5);
		rc.turnOff();
	}	
}
