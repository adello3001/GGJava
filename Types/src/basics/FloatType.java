/*
 * 실수(float)
 * 4byte: 부호(1byte) + 지수(8bit) + 가수(23bit)
 */

package basics;

public class FloatType {

	public static void main(String[] args) {
		float pi = 3.14159f;
		float fv = -0.12345f;
		float f8 =  0.12345678f;
		float f9 =  0.123456789f;
		float f9a = 0.123456785f;
		float f9b = 0.123456786f;
		float f9c = 0.123456787f;
		float f9d = 0.123456788f;
		float f9e = 0.123456789f;
		float f10 = 0.1234567891f;
		
		System.out.println("pi=" + pi);
		System.out.println("fv=" + fv);
		System.out.println("f8=" + f8);   // 최대 소수점이하 8자리까지
		System.out.println("f9=" + f9);  
		System.out.println("f9a=" + f9a);
		System.out.println("f9b=" + f9b);
		System.out.println("f9c=" + f9c);
		System.out.println("f9d=" + f9d);
		System.out.println("f9e=" + f9e);
		System.out.println("f10=" + f10);
		
		// 전체 유효자리 8자리
		float fx1 = 12345.12345678f;
		System.out.println("fx1=" + fx1); 

		float fx2 = 1234567.12345678f;
		System.out.println("fx2=" + fx2);
		
		float fx3 = 0.123456712345678e7f;
		System.out.println("fx3=" + fx3);
		
	}

}
