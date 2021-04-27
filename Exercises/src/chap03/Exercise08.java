package chap03;
/*
 * 나머지(%) 연산을 수행한 결과값에 10을 더하는 코드이다.
 * NaN값을 검사해서 올바른 결과가 출력될 수 있도록 NaN을 검사하는 코드를 작성하라
 */
public class Exercise08 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		// double y = 2.1;
		
		double z = x % y;
		System.out.println("z: " + z);
		
		if(Double.isNaN(z)) {
			System.out.printf("x(%f) 값을 zero(0)으로 나눌 수 없습니다.\n", x);
		}
		else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}
			

	}

}
