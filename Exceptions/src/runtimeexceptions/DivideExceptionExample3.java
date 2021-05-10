package runtimeexceptions;

public class DivideExceptionExample3 {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = 0;
		
		if(y != 0) {
			z = x / y;
		}
		else {
			System.out.println("x의 값을 0으로 나누려고 했습니다.");
		}
		
		System.out.println("z=" + z);
	}

}
