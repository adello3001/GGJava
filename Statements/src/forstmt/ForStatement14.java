package forstmt;
/*
 * 반복문(for)
 *   - continue : 블럭의 시작으로 흐름을 이동하여 조건식을 판단
 */
public class ForStatement14 {

	public static void main(String[] args) {
		for(int cnt=1; cnt <= 10; cnt++) {
			if(cnt % 2 != 0) { // 홀수
				continue;
			}
			
			System.out.println(cnt); // 짝수
		}

	}

}
