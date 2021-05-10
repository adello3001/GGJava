/*
 * [Inner Class]
 * Inner Class는 상위 클래스와 연결
 * Wheel 클래스는 상위 클래스인 Car 클래스의 멤버 변수에 접근 가능
 */
package statics.staticclass;

public class Car {
	String vehicles = "sports car"; 
	
	public Car() {}
	
	public class Wheel {
		public Wheel() {
			vehicles = "taxi";
		}
	}
}
