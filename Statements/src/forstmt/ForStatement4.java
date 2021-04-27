package forstmt;
/*
 * 반복문(for)
 * [문제1] 1부터 100까지 합계를 구하라.
 * 조건 : 10단위로 중간 결과를 출력하라.
*/
public class ForStatement4 {

	public static void main(String[] args) {
		int sum = 0;

		for(int x = 1; x <= 100; x++) {  
			sum += x;
			if((x % 10) == 0) {
				System.out.printf("x(%d), sum(%d)\n", x, sum);
			}
		}

		System.out.printf("sum(%d)\n", sum);		
	}
}
