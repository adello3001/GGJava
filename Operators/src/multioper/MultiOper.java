package multioper;
/*
 * 복합대입연산자
 *   ?= : +=, -=, *=, /=, %=, &=, |=, ^=, <<= >>=, >>>=
 */
public class MultiOper {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 1;

		System.out.println("a=" + a);
		System.out.println("b=" + b);

		c += a; // c = c + a
		System.out.println("c += a : " + c);

		c += a + b; // c = c + a + b;
		System.out.println("c += a + b : " + c);

		c = 2;
		c *= a + b; // c = c * (a + b);
		System.out.println("c *= a + b : " + c);
	}

}
