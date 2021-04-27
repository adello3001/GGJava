package forstmt;
/*
 * 반복문(for)
 * [문제4] 1부터 100까지 숫자 중에서 3의 배수의 합을 구하라.
 * 조건1) 1부터 100까지 1씩 증가하는 경우
*/
public class ForStatement7 {

	public static void main(String[] args) {
		int three_sum = 0;
		
		for(int cnt=1; cnt <= 100; cnt++) {
			if(cnt % 3 == 0) {
				three_sum += cnt;
				System.out.printf("3의 배수(%d), 합(%d)%n", cnt, three_sum);
			}
		}
		
		System.out.printf("3의 배수의 합(%d)%n", three_sum);
	}
}
