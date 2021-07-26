/*
 * 제2장 변수와 타입
 * 확인문제
 * 1. 정수연산은 int 타입으로 변환되어 연산
 * 2. 작은 자료형과 큰 자료형이 연산이 되면 큰 자료형으로 변환되어 연산을 수행한다.
 */
package conversion;

public class example {

	public static void main(String[] args) {
		/*
		 * [문제1] 자바에서 변수에 대한 설명중 틀린 것은?
		 * 정답: 4번, 변수는 초기값이 저장되지 않은 상태에서 읽을 수 있다.
		 * 해설: 읽기 전에 반드시 값이 할당되어야 한다.
		 * int x; // 초기값이 지정되지 않음(쓰레기 값이 들어가 있는 상태)
		 * x = 1; 
		 * int y = x + 10;
		 *    
		 */
		
		/*
		 * [문제2] 변수 이름으로 사용 가능한 것은
		 * 정답: moduleName, $value, _age
		 * 해설: 예약어(class, int)
		 * 1. 변수의 첫번째 문자로 특수문자는 클래스의 멤버 변수로 많이 사용한다.(관례)
		 */
		
		/*
		 * [문제3] 자바의 기본 타입(Primitive Type) 8개
		 * 정답: 
		 *   - 정수타입(byte, char, short, int, long)
		 *   - 실수타입(float, double)
		 *   - 논리타입(boolean)
		 */
		
		/*
		 * [문제4] 타입, 변수이름, 리터널
		 * 정답:  
		 *   - 타입: int, double
		 *   - 변수이름: age, price
		 *   - 리터널: 10, 3.14
		 */

		/*
		 * [문제5] 자동 타입 변환
		 * 정답: 3번, short shortvalue = charvalue;
		 * 해설: char(2byte) 양수를 short(음수, 양수)
		 */
		byte bytevalue = 10;
		char charvalue = 'A';
		
		int intvalue = bytevalue;
		int intvalue2 = charvalue;
		// short shortvalue = charvalue; // Type mismatch: cannot convert from char to short
		short shortvalue = (short)charvalue; // 강제로 타입케스팅할 수있지만 데이터 손실이 발생
		double doublevalue = bytevalue;
		
		/*
		 * [문제6]
		 * 정답: 4번,  char charvar6_1 = (char)strval6; // Cannot cast from String to char
		 */
		int intval6 = 10;
		char charval6 = 'A';
		double dblvar6 = 5.7;
		String strval6 = "Aabdkfdjkfj";
		double dlbvar6_1 = (double)intval6;
		byte bvar6_1 = (byte)intval6;
		int intvar6_1 = (int)dblvar6;
		// char charvar6_1 = (char)strval6; // Cannot cast from String to char
		
		/*
		 * [문제7] 변수를 잘못 초기화 한 것은?
		 * 정답: 3번, char char7 = ''; // Invalid character constant
		 */
		int var7 = 10;
		long long7 = 100000000000L;
		// char char7 = ''; // Invalid character constant
		double dbl7 = 10;
		float flt7 = 10;
		
		/*
		 * [문제8] 연산식에서의 타입 변환 내용, 컴파일러 오류?
		 * 정답: 1번, 
		 * 해설: byte retbyte8 = byteval8 + byteval8; // Type mismatch: cannot convert from int to byte
		 */
		
		byte byteval8 = 10;
		float floatval8 = 2.5F;
		double dblval8 = 2.5;
		
		// byte retbyte8 = byteval8 + byteval8; // Type mismatch: cannot convert from int to byte
		byte retbyte8 = (byte)(byteval8 + byteval8); // (byte + byte) -> int -> byte
		int retint8 = 5 + byteval8;      // int(5) + int(byteval8) -> int
		float retfloat8 = 5 + floatval8; // float(5.0f) + float(floatval8) -> float
		double retdbl8 = 5 + dblval8;    // double(5.0) + double(dblval8) -> double
		
		/*
		 * long = int + long
		 */
		int intx1 = 100;
		long longx1 = 1000L;
		long retx1 = intx1 + longx1;  // long(intx1) + long(longx1) -> long
		System.out.println(retx1);
	}

}
