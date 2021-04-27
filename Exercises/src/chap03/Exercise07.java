package chap03;

public class Exercise07 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		boolean result1 = (x > 7) && (y <= 5);
		boolean f1 = (x % 3 == 2);  // false
		boolean f2 = (y % 2 != 1);  // false
		boolean result2 = f1 || f2; // false
		System.out.println("(x > 7) && (y <= 5) : " + result1);        // true
		System.out.printf("(%b) || (%b) -> (%b)\n", f1, f2, result2);  // false 
	}

}
