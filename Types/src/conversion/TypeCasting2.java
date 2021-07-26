/*
 * 강제타입변환
 * 1. 특정한 타입으로 강제 변환
 * 2. 큰타입에서 작은 타입으로 변환(자료의 손실이 발생)
 * 3. 실수를 정수로 변환시키면 소수점 이하는 버려지고 정수만 취한다.
 */
package conversion;

public class TypeCasting2 {

	public static void main(String[] args) {
		float pi = 3.14159f;
		double pid = 3.14159;
		int pix = (int)pi;
		int pix1 = (int)pid;
		
		System.out.printf("pi(%f), pid(%f), pix(%d), pix1(%d)\n", pi, pid, pix, pix1);
	}
}
