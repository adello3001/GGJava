package bitoper;
/*
 * 비트연산자
 * 반전: ~
 */

public class BitNotOper {

	public static void main(String[] args) {
		// 비트 반전
		byte b1 = 1;
		// byte b2 = ~b1;  // Type mismatch: cannot convert from int to byte
		
		int b2 = ~b1;   // 비트 반전의 피연자는 int로 처리가 되므로 변수 int로 할당
		byte b3 = (byte)~b1;  // byte로 타입변환
		
		System.out.printf("b1(%d)(0x%x), b2(%d)(0x%x), b3(%d)(0x%x) %n", b1, b1, b2, b2, b3, b3);
		
		byte b10 = 10;
		byte b11m = (byte)~b10;        // 1의 보수
		byte b10m = (byte)(~b10 + 1);  // 2의 보수(반전시킨 값에 +1) 
		System.out.printf("b10(%d)(0x%x), b11m(%d)(0x%x), b10m(%d)(0x%x) %n", b10, b10, b11m, b11m, b10m, b10m);
	}

	public static void toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		System.out.printf("toBinaryString: value(%d), [%s]\n", value, str);
	}

	/*
	public static void toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		
		while(str.length() < 32) {
			str = "0" + str;
		}
		
	}
	*/
}
