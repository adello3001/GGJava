/*
 * 단정도 실수 : float
 * 부동소수점: 소수점을 포함하는 숫자
 */

public class VariableFloat {

	public static void main(String[] args) {
		float a = 0.1234f;
		float b = 0.13159f;
		float mb = -0.13159f;
		float c = 1234.5678f;
		float d = -1234.5678f;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("mb=" + mb);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		
		float e1 = 5E3f; // 5 * exponent3(10 * 10 * 10) 
		float e2 = 5.0f * 1000.0f; // 5 * (10 * 10 * 10)
		
		System.out.println("e1=" + e1);
		System.out.println("e2=" + e2);
		
		float ez12 = 0.12E-3f; // 0.12 * -(10 * 10 * 10), 1.2E-4
		System.out.println("e2=" + ez12);
		
		float ex1 = 1234.567f;
		float ex2 = 0.1234567e4f; // e4(10 * 10 * 10 * 10)
		System.out.println("ex1=" + ex1);
		System.out.println("ex2=" + ex2);
	}
}
