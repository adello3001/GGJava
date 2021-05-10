package runtimeexceptions;

public class DivideExceptionExample2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = (y != 0) ? x / y : 0;
		
		System.out.println("z=" + z);
	}

}
