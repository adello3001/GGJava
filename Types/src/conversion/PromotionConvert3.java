/*
 * 자동타입변환(Promotion)
 */
package conversion;

public class PromotionConvert3 {

	public static void main(String[] args) {
		int intvalue = 1234567899;
		float floatvalue = intvalue;
		double doublevalue = intvalue;
		
		System.out.println("int=" + intvalue);
		System.out.println("int -> float : " + floatvalue);
		System.out.println("int -> double : " + doublevalue);
		
	}

}
