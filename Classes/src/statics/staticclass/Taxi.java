/*
 * [Static Class]
 * static class는 하위 클래스를 선언할 때만 가능
 */
package statics.staticclass;

// error
// public static class Taxi {

public class Taxi {
	String vehicles = "sports car"; 
	
	public Taxi() {}
	
	public static class Wheel {
		static String tire = "NEXEN TIRE";
		
		public Wheel() {}
		
		String getTires() {
			return Wheel.tire;
		}
	}
	
	public static void main(String[] args) {
		Taxi.Wheel wheel = new Taxi.Wheel();
		System.out.println("vehicles=" + wheel.getTires());
	}
}
