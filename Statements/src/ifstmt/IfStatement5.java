package ifstmt;
/*
 * 조건문: 조건문
 * [문제] 60부터 100점 사이의 난수를 발생시켜서 등급을 나누어라.
 *    A: 90점이상, B:80점이상, C:70점이상, D:60점이상, F:60점미만
 *    MAX = 100 - 60
 *    RESULT = RANDOM * (MAX + 1) + 시작값
 */
public class IfStatement5 {

	public static void main(String[] args) {
		double x = Math.random();
		int score = (int)(x * (100 - 60 + 1) + 60);
		
		System.out.printf("random:(%f)(%d)", x, score);
		
		char grade = 'X';
		
		if((score >= 90) && (score <= 100)) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else if(score >= 60) {
			grade = 'D';
		}
		else if(score >= 0 && score < 60) {
			grade = 'F';
		}
		else {
			System.out.println("점수에 오류가 있습니다.");
		}
	
		System.out.printf("Your Grade is (%c)\n", grade);
	}
}
