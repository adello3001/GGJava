package overflow;
/*
 * Nan(Not a Number)
 * Infinity(무한대)
 */
public class NanInfinity {

	public static void main(String[] args) {
		int zeroval = 0;
		// int zeroval = 3;
		double divfivezero = 5;

		try {
			divfivezero = divfivezero / zeroval;
			
			System.out.println(Double.isInfinite(divfivezero));
			System.out.println(Double.isNaN(divfivezero));
			
			// int divfivezero2 = 5 % 0;
			// System.out.println("divfivezero2=" + divfivezero2);
		} catch(ArithmeticException e) {
			System.out.println("예외발생:" + e);
		}
		
		System.out.println("divfivezero=" + divfivezero);

		// 나머지
		try {
			divfivezero = divfivezero % zeroval;
			System.out.println(Double.isInfinite(divfivezero));
			System.out.println(Double.isNaN(divfivezero));
		} catch(ArithmeticException e) {
			System.out.println("예외발생:" + e);
		}
		
		System.out.println("divfivezero=" + divfivezero);
	}
}
