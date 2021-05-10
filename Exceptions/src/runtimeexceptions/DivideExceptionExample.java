package runtimeexceptions;

public class DivideExceptionExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = x / y; // ArithmeticExcpetion
		
		System.out.println("z=" + z);
	}

}
