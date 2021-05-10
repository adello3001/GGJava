/*
 * [Static Nested Class]
 * static으로 클래스를 선언하면 클래스가 분리 됨
 * Wheel 클래스는 상위 클래스인 Car 클래스의 멤버 변수에 접근할 수 없음
 * Static nested class는 상위 클래스가 생성되지 않아도, 외부에서 직접 객체를 생성 가능
 */
package statics.staticclass;

public class Truck {
	String vehicles = "sports car"; 
	
	public Truck() {}
	
	public static class Wheel {
		public Wheel() {
			// Cannot make a static reference to the non-static field vehicles
			// vehicles = "taxi";
			System.out.println("Wheel() !!!");
		}
	}
	
	public static void main(String[] args) {
		Truck.Wheel wheel = new Truck.Wheel();
		
	}
}
