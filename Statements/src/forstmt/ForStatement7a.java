package forstmt;
/*
 * 반복문(for)
 * [문제4] 1부터 100까지 숫자 중에서 3의 배수의 합을 구하라.
 * 조건2) 1부터 100까지 주어진 배수 단위로 증가
*/
public class ForStatement7a {

	public static void main(String[] args) {
		int three_sum = 0;
		
		for(int cnt=3; cnt <= 100; cnt += 3) {
			three_sum += cnt;
			System.out.printf("3의 배수(%d), 합(%d)%n", cnt, three_sum);
		}
		
		System.out.printf("3의 배수의 합(%d)%n", three_sum);
	}
}
