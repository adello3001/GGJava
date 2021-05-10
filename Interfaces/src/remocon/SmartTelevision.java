/*
 * 다중 인터페이스 구현 클래스
 */
package remocon;

public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void search(String url) { // Searchable
		System.out.printf("[SmartTelevision] search(%s)\n", url);
	}

	@Override
	public void turnOn() { // RemoteControl
		System.out.println("[SmartTelevision] turnOn");
	}

	@Override
	public void turnOff() { // RemoteControl
		System.out.println("[SmartTelevision] turnOff");
	}

	@Override
	public void setVolumn(int volumn) { // RemoteControl
		System.out.println("[SmartTelevision] setVolumn=" + volumn);
	}
}
