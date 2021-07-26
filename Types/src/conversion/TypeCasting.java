/*
 * 강제타입변환
 * 1. 특정한 타입으로 강제 변환
 * 2. 큰타입에서 작은 타입으로 변환(자료의 손실이 발생)
 */
package conversion;

public class TypeCasting {

	public static void main(String[] args) {
		int intvalue = 300; // 0x012c(0001 0010 1100)
		// byte bytevalue = intvalue; // Type mismatch: cannot convert from int to byte
		byte bytevalue = (byte)intvalue; // 0x012c(0001 0010 1100) -> 0x2c(0010 1100)

		System.out.printf("int(%d)(%x), byte(%d)(%x)\n", intvalue, intvalue, bytevalue, bytevalue);

	}

}
