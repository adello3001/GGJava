/*
 * 논리타입(boolean)
 * 논리값(true, false)
 * 참과 거짓
 */
package basics;

public class BooleanType {

	public static void main(String[] args) {
		boolean t = true;    // 1
		boolean f = false;   // 0
		
		boolean tf;
		
		tf = t;
		
		System.out.println("tf=" + tf);
		
		
		System.out.println("True=" + t);
		System.out.println("False=" + f);
		
		System.out.printf("True=(%b)\n", t);
		System.out.printf("False=(%b)\n", f);
	}

}
