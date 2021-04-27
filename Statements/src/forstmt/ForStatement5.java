package forstmt;
/*
 * 반복문(for)
 * [문제3] 1부터 100까지 숫자 중에서 홀수의 합과 짝수의 합을 구하라.
*/
public class ForStatement5 {

	public static void main(String[] args) {
		int even_sum = 0; // 짝수의 합
		int odd_sum = 0;  // 홀수의 합
		
		for(int cnt=1; cnt <= 100; cnt++) {
			if(cnt % 2 == 0) {
				even_sum += cnt;
				// System.out.printf("짝수(%d), 합(%d)%n", cnt, even_sum);
			}
			else {
				odd_sum += cnt;
				// System.out.printf("홀수(%d), (%d)%n", cnt, odd_sum);
			}
		}
		
		System.out.printf("홀수의 합(%d), 짝수의 합(%d)%n", odd_sum, even_sum);
	}
}
