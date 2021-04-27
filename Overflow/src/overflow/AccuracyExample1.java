package overflow;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		float pieceUnit = 0.1f;
		int number = 7;
		
		float seven = number * pieceUnit;
		// float result = apple - number * pieceUnit;
		float result = apple - seven;
		
		System.out.println("seven=" + seven);
		System.out.println("result=" + result);
	}

}
