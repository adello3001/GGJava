package overflow;

public class AccuracyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int three = totalPieces - number;
		
		double result = three / 10.0;
		
		System.out.println("seven=" + three);
		System.out.println("result=" + result);
	}

}
