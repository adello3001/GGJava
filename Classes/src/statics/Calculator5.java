/*
 * 정적메소드(static method):
 *   - 클래스를 객체화 시키지 않고 사용한다.(new를 하지 않고 사용한다)
 *   - this가 없다.
 */
package statics;

public class Calculator5 {
	static int static_count = 0;
	int value = 0;

	Calculator5() {
		this.value++;
		Calculator5.static_count++;
	}
	
	void print() {
		System.out.printf("value(%d), static_count(%d)\n", this.value, Calculator5.static_count);
	}
	
	static int printStaticCount() {
		System.out.printf("printStaticCount(): static_count(%d)\n", Calculator5.static_count);
		return Calculator5.static_count;
	}
	
	static int addStaticCount(int count) {
		// this가 없다.
		// this.static_count = 0;
		// this.value = 0;
		Calculator5.static_count += count;
		return Calculator5.static_count;
	}
	
	public static void main(String[] args) {
		Calculator5.addStaticCount(10);
		Calculator5.printStaticCount();
	}
}
