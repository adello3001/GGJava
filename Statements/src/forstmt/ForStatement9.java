package forstmt;
/*
 * 반복문(for)
 * [문제7] 1부터 2020까지 숫자 중에서 다음의 조건을 만족하는 것을 출력하라.
 *       - 4로 나누어지고 100으로 나누어지지 않으며 400으로 나누어지는 수
 *       - 100, 200, 300, 400(*) 
 *       - 윤년은 4년에 한 번씩 온다.
 *       - 100년 한 번 오지 않는다.
 *       - 400년 한 번 온다.
 *       
*/
public class ForStatement9 {

	public static void main(String[] args) {
		int y = 2008;
		if(y % 4 == 0) {
			if(y % 100 != 0 || y % 400 == 0) {
				System.out.printf("윤년:(%d) %n", y);
			}
			else {
				System.out.printf("평년:(%d) %n", y);
			}
		}
		else {
			System.out.printf("평년:(%d) %n", y);
		}
		
		int x = 2008;
		if((x % 4 == 0) && ((x % 100 != 0) || (x % 400 == 0))) {
			System.out.printf("윤년:(%d) %n", x);
		}
		else {
			System.out.printf("평년:(%d) %n", x);
		}
	}
}
