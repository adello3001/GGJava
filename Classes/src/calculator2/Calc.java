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
package calculator2;

class Calc {
	double total;
	
	Calc() {
		total = 0;
	}
	
	Calc(int total) {
		this.total = total;
	}
	
	Calc(double total) {
		this.total = total;
	}
	
	Calc(Calc calc) {
		total = calc.total();
	}
	
	void plus(int x) {
		total += x;
	}
	
	void plus(double x) {
		total += x;
	}
	
	void minus(int x) {
		total -= x;
	}

	void minus(double x) {
		total -= x;
	}

	void multiple(int x) {
		total *= x;
	}
	
	void multiple(double x) {
		total *= x;
	}
	
	void divide(int x) {
		total /= x;
	}
	
	void divide(double x) {
		total /= x;
	}
	
	void print() {
		System.out.println("total: " + total);
	}
	
	double total() {
		return total;
	}
}
