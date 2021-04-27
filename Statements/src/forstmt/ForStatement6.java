package forstmt;
/*
 * 반복문(for)
 * [문제4] 1부터 100까지 숫자 중에서 2의 배수의 합을 구하라.
 * 조건1) 1부터 100까지 1씩 증가하는 경우
*/
public class ForStatement6 {

	public static void main(String[] args) {
		int two_sum = 0;
		
		for(int cnt=1; cnt <= 10; cnt++) {
			if(cnt % 2 == 0) {
				two_sum += cnt;
				System.out.printf("짝수(%d), 합(%d)%n", cnt, two_sum);
			}
		}
		
		System.out.printf("짝수의 합%n", two_sum);
	}
}
