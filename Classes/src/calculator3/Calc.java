/*
 * 사칙연산을 하는 전자계산기
 * 클래스 : Calc
 * 속성 : ?
 * 메소드 : plus, minus, multiple, divide, sum, print
 *    - plus(int x)     : 더하기
 *    - minus(int x)    : 빼기
 *    - multiple(int x) : 곱하기
 *    - divide(int x)   : 나누기
 *    - print() : 사칙연산 결과를 출력
 * 확장: 실수형도 처리    
 */
package calculator3;

class Calc {
	int total;
	
	Calc() {
		total = 0;
	}
	
	Calc(int total) {
		this.total = total;
	}
	
	void sum(int[] values) { // 배열
		for(int x : values) {
			total += x;
		}
	}
	
	void plus(int ... values) { // 가변인자
		for(int x : values) {
			total += x;
		}
	}
	
	void minus(int x) {
		total -= x;
	}

	void multiple(int x) {
		total *= x;
	}
	
	void divide(int x) {
		total /= x;
	}
	
	
	void print(String title) {
		System.out.printf("[%s] total: %d\n", title, total);
	}
	
	double total() {
		return total;
	}
}
