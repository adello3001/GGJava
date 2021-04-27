/*
 +127 : 0111 1111
      +         1
-----------------------
        1000 0000(-128)
      -         1
-----------------------
        011111111(127)      
*/

package basics;

public class ByteType {

	public static void main(String[] args) {
		byte minus128 = -128;
		byte plus127 = 127;
		
		System.out.println("minus(128)" + minus128);
		System.out.println("plus(127)" + plus127);

		// Type mismatch: cannot convert from int to byte
		// byte plus = 128; 

		byte plus128 = (byte)128;
		System.out.println("plus(128)" + plus128);
		
		plus127 = (byte)(plus127 + 1);
		System.out.println("plus(127+1)" + plus127);

		minus128 = (byte)(minus128 - 1);
		System.out.println("minus(-128-1)" + minus128);
	}

}
