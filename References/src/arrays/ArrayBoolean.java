package arrays;
/*
 * ¹è¿­(boolean)
 */
public class ArrayBoolean {

	public static void main(String[] args) {
		boolean[] tf = { true, false };
		
		boolean bAnd  = tf[0] && tf[1];
		boolean bOr   = tf[0] || tf[1];
		boolean bFalse = !tf[0];
		boolean bTrue  = !tf[1];
		
		System.out.printf("boolean array: [%b], [%b]\n", tf[0], tf[1]);
		System.out.printf("boolean array: [%b] and [%b] = [%b]\n", tf[0], tf[1], bAnd);
		System.out.printf("boolean array: [%b] or  [%b] = [%b]\n", tf[0], tf[1], bOr);
		System.out.printf("boolean array: [%b],  [%b]\n", bFalse, bTrue);

	}

}
