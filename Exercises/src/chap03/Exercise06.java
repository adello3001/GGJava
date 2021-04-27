package chap03;
/*
 * ªÁ¥Ÿ∏Æ≤√¿« ≥–¿Ã∏¶ ±∏«œ∂Û
 * (¿≠∫Ø + æ∆∑ß∫Ø) * ≥Ù¿Ã / 2
 */
public class Exercise06 {

	public static void main(String[] args) {
		int lengthTop = 5;      // ¿≠∫Ø
		int lengthBottom = 10;  // æ∆∑ß∫Ø
		int height = 7;         // ≥Ù¿Ã
		double area = (lengthTop + lengthBottom) * height / 2.0;
		System.out.println("area=" + area);
	}
}
