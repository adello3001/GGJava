package ifstmt;
/*
 * 조건문: 중첩 조건문
 * [문제] 0부터 100점 사이의 난수를 발생시켜서 등급을 나누어라.
 *    - A: 90점이상, B:80점이상, C:70점이상, D:60점이상, F:60점미만
 *    - 60점 미만이면 경고 메시지를 출력한다.
 *    - A : "전액 장학생" 메시지를 출력
 *    - B : "반액 장학생" 메시지를 출력
 *    - C,D : "내년을 기약" 메시지를 출력 
 *    
 *    - A~D : "합격" 메시지 출력
 *    - F: "과락" 메시지를 출력
 *    
 * 조건: 중첩 조건문을 써서 작성  
 */
public class IfStatement7 {

	public static void main(String[] args) {
		double x = Math.random();
		int score = (int)(x * 101);
		
		System.out.printf("random:(%f)(%d)%n", x, score);
		
		String pass="", msg="";
		char grade='X';
		
		if(score >= 60) {
			pass = "합격";
			if((score >= 90) && (score <= 100)) {
				grade = 'A';
				msg = "전액 장학생";
			}
			else if(score >= 80) {
				grade = 'B';
				msg = "반액 장학생";
			}
			else if(score >= 70) {
				grade = 'C';
				msg = "내년을 기약";
			}
			else if(score >= 60) {
				grade = 'D';
				msg = "내년을 기약";
			}			
		}
		else {
			pass = "과락";
			grade = 'F';
			msg = "다시 도전하세요";
		}
		
		System.out.printf("[%d][%c]->[%s][%s]\n", score, grade, pass, msg);
	}
}
