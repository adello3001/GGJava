package forstmt;
/*
 * 반복문(for)
 * for(초기화식; 조건식; 증감식) {
 *    처리코드(실행문)
 * }
 * 
 * for() 블럭에서 선언된 변수는 로컬변수로서 블럭을 벗어나면 사라진다.
 */
public class ForStatement2 {

	public static void main(String[] args) {
		// 1부터 10까지 합계
		int sum = 0;
		for(int x=1; x <= 10; x++) {
			sum += x;
			System.out.printf("x(%d), sum(%d)\n", x, sum);
		}

		System.out.printf("sum(%d)\n", sum);
	}
}
