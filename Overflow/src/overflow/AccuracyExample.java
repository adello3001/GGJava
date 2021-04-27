package overflow;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double seven = number * pieceUnit;
		double result = apple - number * pieceUnit; // 1 - 0.7 -> 0.3
		
		System.out.println("seven=" + seven);
		System.out.println("result=" + result); // 0.299999
	}

}
