/*
 * 정수(int)
 * 4바이트(32비트)
 * 범위 : -2147483648~2147483647
 * 자바에서 정수의 기본 타입
 */
package basics;

public class IntType {

	public static void main(String[] args) {
		int min = -2147483648;
		int max = 2147483647;
		
		System.out.println("min int=" + min);
		System.out.println("max int=" + max);
		
		int max1 = max + 1;
		int min1 = min - 1;

		System.out.println("(+2147483648 + 1)=" + max1);
		System.out.println("(-2147483648 - 1)=" + min1);
	}

}
