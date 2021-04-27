package forstmt;
/*
 * 반복문(for)
 * for(초기식; 조건식; 증감식) {
 *    처리코드(실행문)
 * }
 * 
 * 초기식 : 반복문이 처음 실행될 때
 * 조건식 : 초기화식에 지정된 변수값을 판단
 * 증감식 : 조건식을 만족할 때 블럭의 실행문을 실행 후, 두 번째부터 실행된다.
 * 
 * 반복문(for)에서 선언된 변수는 로컬변수로서 블럭을 벗어나면 사라진다.
 */
public class ForStatement1a {

	public static void main(String[] args) {
		for(int x = 1; x <= 10; x++) {
			System.out.printf("x(%d)\n", x);
		}
		
		System.out.printf("x(%d)\n", 1);
		System.out.printf("x(%d)\n", 2);
		System.out.printf("x(%d)\n", 3);
		System.out.printf("x(%d)\n", 4);
		System.out.printf("x(%d)\n", 5);
		System.out.printf("x(%d)\n", 6);
		System.out.printf("x(%d)\n", 7);
		System.out.printf("x(%d)\n", 8);
		System.out.printf("x(%d)\n", 9);
		System.out.printf("x(%d)\n", 10);
	}
}
