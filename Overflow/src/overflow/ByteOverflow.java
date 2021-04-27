package overflow;
/*
 * Overflow(byte)
 */
public class ByteOverflow {

	public static void main(String[] args) {
		System.out.printf("byte max(%d), byte min(%d) %n", Byte.MAX_VALUE, Byte.MIN_VALUE);
		
		byte maxbyte = Byte.MAX_VALUE;
		byte minbyte = (byte)(maxbyte + 1);
		System.out.printf("maxbyte(%d)(0x%x), minbyte(%d)(0x%x) %n", maxbyte, maxbyte, minbyte, minbyte);
		toBinaryString(maxbyte);
		toBinaryString(minbyte);
	}

	public static void toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		System.out.printf("toBinaryString: value(%d), [%s]\n", value, str);
	}
}
