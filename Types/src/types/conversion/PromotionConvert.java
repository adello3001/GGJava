/*
 * 자동타입변환(Promotion)
 * 1. 작은 타입에서 큰 타입으로 변환
 */
package conversion;

public class PromotionConvert {

	public static void main(String[] args) {
		// char(2byte) <- byte(1byte)
		byte b1 = 65;
		// char c1 = b1; // error
		char c1 = (char)b1;
		System.out.println("b1=" + b1);
		System.out.println("c1=" + c1);
		
		byte b2 = -100;
		char c2 = (char)b2;
		byte b3 = (byte)c2;
		System.out.println("b2=" + b2);
		System.out.println("c2=" + c2);
		System.out.println("b3=" + b3);
		
		// int(4byte) <- byte(1byte)
		byte bytevalue = 10;
		int intvalue = bytevalue;
		System.out.println(bytevalue);
		System.out.println(intvalue);
		
		// int(4byte) <- char(2byte)
		char charvalue = '가';
		int intga = charvalue;
		System.out.printf("(%c), (%d), (%c)\n", charvalue, intga, intga);
		
	}

}
