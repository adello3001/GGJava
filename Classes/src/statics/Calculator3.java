/*
 * 클래스의 정적멤버변수(static)은 하나의 클래스로부터 생성된 객체들 가운데 하나만 생성된다.
 * 객체에 소속된 멤버가 아니라 클래스에 소속된 멤버이다.
 */
package statics;

public class Calculator3 {
	static float pi = 3.14f;

	String id;
	int total = -1;
	
	Calculator3(String id, int total, float pi) {
		this.id = id;
		this.total = total;
		Calculator3.pi = pi;
	}
	
	void println() {
		System.out.printf("[%s]\n", this.id);
		System.out.println("> total=" + this.total);
		System.out.println("> pi=" + Calculator3.pi);
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Calculator3: pi=" + Calculator3.pi);
		// System.out.println("Calculator3: id=" + Calculator3.id);
	}
}
