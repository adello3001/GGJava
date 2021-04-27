/*
 * 다른 타입의 두 피연산자가 있을 때 큰 타입으로 변환 후 연산을 한다.
 */
package conversion;

public class OperCasting {

	public static void main(String[] args) {
		int intvalue = 12345;
		double dblval = 0.12345;
		double retval = intvalue + dblval;
		
		System.out.println(intvalue);
		System.out.println(dblval);
		System.out.println("결과:" + retval);
		System.out.printf("결과(%f) = (%d) + (%f)\n", retval, intvalue, dblval);
		
		double dblval2 = 3.123;
		double retval2 = intvalue + (int)dblval2; // 소수점 이하는 버림(12348 = 12345 + 3)
		System.out.println(intvalue);
		System.out.println(dblval2);
		System.out.println(retval2);
		System.out.printf("결과(%f) = (%d) + (%f)\n", retval2, intvalue, dblval2);
	}

}
