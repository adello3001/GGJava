package forstmt;
/*
 * 반복문(for)
 * [문제4] 1부터 100까지 숫자 중에서 2의 배수의 합을 구하라.
 * 조건2) 1부터 100까지 주어진 배수 단위로 증가
*/
public class ForStatement6a {

	public static void main(String[] args) {
		int two_sum = 0;
		
		for(int cnt=2; cnt <= 100; cnt += 2) {
			two_sum += cnt;
			System.out.printf("2배수(%d), 합(%d)%n", cnt, two_sum);
		}
		
		System.out.printf("2의 배수의 합(%d)%n", two_sum);
	}
}
