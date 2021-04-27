/*
 * 변수값 읽기
 * 원시타입(primitive)의 변수는 사용되기 전에 반드시 값이 할당되어야 한다.
 */

public class VariableRead {
	public static void main(String[] args) {
		int x = 0;
		int y; // 변수 y가 선언될 때 초기값이 할당되지 않으면 읽기 전에 값이 할당되어야 한다. 
		int z;
		
		y = x; // 사용되기 전에 할당되어야 한다.

		// z = z + 1; 오류
		z = y + x;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
}
