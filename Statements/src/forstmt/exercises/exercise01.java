package forstmt.exercises;
/*
 * 반복문(for)
 * [문제4] 0부터 99까지 숫자 중에서 홀수의 합을 구하라.
*/
public class exercise01 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int cnt=0; cnt <= 99; cnt++) {
			if(cnt % 2 == 1) {
				sum += cnt;
				System.out.printf("홀수(%d), 합(%d)%n", cnt, sum);
			}
		}
		
		System.out.printf("홀수의 합%n", sum);
	}
}
