/*
 * 단정도 정수(short)
 * 2바이트(16비트)
 * 범위 : -32768~32767
 * 
 */
package basics;

public class ShortType {

	public static void main(String[] args) {
		short minsm = -32768;
		short maxsp = 32767;
		
		System.out.println("min short=" + minsm);
		System.out.println("max short=" + maxsp);
		
		short s1 = (short)(maxsp + 1);
		short s2 = (short)(minsm - 1);

		System.out.println("(+32767 + 1)=" + s1);
		System.out.println("(-32768 - 1)=" + s2);
	}

}
