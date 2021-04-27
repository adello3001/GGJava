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
public class ForStatement9a {

	public static void main(String[] args) {
	
		for(int cnt = 1; cnt <= 2020; cnt++) {
			if(cnt % 4 == 0) {
				if(cnt % 100 != 0 || cnt % 400 == 0) {
					System.out.printf("윤년:(%d) %n", cnt);
				}
			}
		}
		
		for(int x = 1; x <= 2020; x++) {
			if((x % 4 == 0) && ((x % 100 != 0) || (x % 400 == 0))) {
				System.out.printf("윤년:(%d) %n", x);
			}
			else {
				System.out.printf("평년:(%d) %n", x);
			}
		}
	}
}
