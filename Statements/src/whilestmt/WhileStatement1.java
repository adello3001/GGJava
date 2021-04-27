package whilestmt;
/*
 * 반복문(while)
 *   - 조건식이 참이면 블럭을 계속 수행
 *   - 조건식 : 비교연산식, 논리연산식
 */
public class WhileStatement1 {
	public static void main(String[] args) {
		int cnt = 0;
		
		while(++cnt <= 10) {
			System.out.println("cnt=" + cnt);
		}
		
		while(cnt > 1) {
			System.out.println("cnt=" + --cnt);
		}
	}
}
