/*
 * 클래스의 정적멤버변수(static)은 하나의 클래스로부터 생성된 객체들 가운데 하나만 생성된다.
 *   - 객체에 소속된 멤버가 아니라 클래스에 소속된 멤버이다.
 *   - 클래스를 객체화 시키지 않고 사용한다.(new를 하지 않고 사용한다)
 */
package statics;

public class Calculator {
	String id;
	static float pi = 3.14f;
	int total = -1;
	
	Calculator(String id, int total, float pi) {
		this.id = id;
		this.total = total;
		this.pi = pi;
	}
	
	void println() {
		System.out.printf("[%s]\n", this.id);
		System.out.println("> total=" + this.total);
		System.out.println("> pi=" + this.pi);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Calculator calc1 = new Calculator("calc1", 9, 0.14f);
		calc1.println();
		
		Calculator calc2 = new Calculator("calc2", 10, 3.14159f);
		calc2.println();
		
		calc1.println(); // pi는 마지막으로 수정된 값을 유지 
	}

}
