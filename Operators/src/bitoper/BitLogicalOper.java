package bitoper;
/*
 * 비트 논리 연산자
 *   - AND : &,   a & b, a와 b중에 모두 1이면 1, 아니면 0
 *   - OR  : |,   a | b, a와 b중에 하나라도 1이면 1, 둘 다 0이면 0
 *   - XOR : ^,   a ^ b, a와 b중에 하나만 1이면 1, 둘 다 같으면 0
 */
public class BitLogicalOper {

	public static void main(String[] args) {
		byte a = 0x0f;
		byte b = 0x0a;
		byte and = (byte)(a & b);
		byte or = (byte)(a | b);
		byte xor = (byte)(a ^ b);
		
		PrintBinaryString("a", a);
		PrintBinaryString("b", b);
		PrintBinaryString("and", and);
		PrintBinaryString("or", or);
		PrintBinaryString("xor", xor);
	}

	public static void PrintBinaryString(String title, int value) {
		String strbin = Integer.toBinaryString(value);
		System.out.printf("%s: value(%d)(0x%x), [%s]\n", title, value, value, strbin);
	}
}
