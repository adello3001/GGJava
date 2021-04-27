/*
 * 정수(long)
 * 8byte(64bit)
 * 범위: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
 * 표현: 숫자뒤에 l, L붙인다.
 * 숫자리터널 뒤에 l, L을 붙이지 않으면 정수(int)로 처리한다.
 */
package basics;

public class LongType {

	public static void main(String[] args) {
		long l = 10;
		long ll = 11l;
		long lL = 12L;
		
		System.out.println("l=" + l);
		System.out.println("ll=" + ll);
		System.out.println("lL=" + lL);
		
		// long li2 = 2147483648; // out of range
		long li1 = 2147483647 + 1; // int로 처리되어 값이 할당된다.
		System.out.println("li1=" + li1); // -2147483648
		
		
		long li2 = 2147483648L;
		System.out.println("li2=" + li2);
		
		long li3 = 2147483647L + 1;
		System.out.println("li3=" + li3);
	}

}
