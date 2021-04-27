package fields;

public class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRigthTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRigthTire = new Tire("뒤오른쪽", 4);
	// 생성자
	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) {
			stop(); return 1;
		}
		if(frontRigthTire.roll() == false) {
			stop(); return 2;
		}
		if(backLeftTire.roll() == false) {
			stop(); return 3;
		}
		if(backRigthTire.roll() == false) {
			stop(); return 4;
		}
			return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
