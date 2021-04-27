package bitoper;
/*
 * 비트 이동 연산자
 *  - 왼쪽이동(<<) :  a << b, a를 b만큼 왼쪽으로 이동
 *  - 오른쪽이동(>>) : a >> b, a를 b만큼 오른쪽으로 이동(MSB가 채워진다)
 *  - 오른쪽이동(>>>) : a >>> b, a를 b만큼 오른쪽으로 이동(zero로 채워진다)
 */
public class BitShiftOper {

	public static void main(String[] args) {
		byte a = (byte)0x01;
		byte b = (byte)0x03;
		int c = 0x80000000;
		byte ls3 = (byte)(a << b);
		byte rs3 = (byte)(ls3 >> b);
		int rsm1 = c >> 31;
		int rsm2 = c >>> 31;


		PrintBinaryString("a", a);
		PrintBinaryString("b", b);
		PrintBinaryString("c", c);
		PrintBinaryString("ls3", ls3);
		PrintBinaryString("rs3", rs3);
		PrintBinaryString("rsm1", rsm1);
		PrintBinaryString("rsm2", rsm2);

		/*
		byte bc = (byte)0x80;
		byte bc1 = (byte)((byte)bc >> 7);
		byte bc2 = (byte)((byte)bc >>> 7);
		PrintBinaryString("bc", bc);
		PrintBinaryString("bc1", bc1);
		PrintBinaryString("bc2", bc2);
		*/
	}
	
	public static void PrintBinaryString(String title, int value) {
		String strbin = Integer.toBinaryString(value);
		System.out.printf("%s: value(%d)(0x%x), [%s]\n", title, value, value, strbin);
	}
}
