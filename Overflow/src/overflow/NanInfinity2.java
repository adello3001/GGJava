package overflow;
/*
 * Nan(Not a Number)
 * Infinity(¹«ÇÑ´ë)
 */
public class NanInfinity2 {

	public static void main(String[] args) {
		String indata = "NaN";
		// String indata = "abc";
		
		double inval = Double.valueOf(indata);
		double val = Double.isNaN(inval) ? 0 : inval;
		
		double balance = 1234.12;
		balance = balance + val;
		System.out.printf("indata(%s), val(%f), balance(%f)\n", 
				indata, val, balance);
	}
}
