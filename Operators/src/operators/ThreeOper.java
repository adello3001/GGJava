package operators;
/*
 * 삼항연산자
 * 변수(결과) = (조건식) ? 참인 경우값 : 거짓인 경우값;
 * 1. 조건식이 참이면 참인 경우의 값을 결과에 할당
 * 2. 조건식이 거짓이면 거짓인 경우의 값을 결과에 할당
 */
public class ThreeOper {

	public static void main(String[] args) {
		int score = 90;
		char grade = (score >= 90) ? 'A' : 'B';
		
		System.out.printf("score(%d) : grade(%c)\n", score, grade);

		score = 88;
		String strGrade = (score >= 90) ? "참 잘했어요!" : "잘 했어요";
		System.out.printf("score(%d) : grade(%s)\n", score, strGrade);
		
		/*
		 * [문제] 등급 출력
		 * A : >= 90
		 * B : >= 80
		 * C : >= 70
		 * D : >= 60
		 * F : < 60
		 */
		
		score = 66;
		grade = (score >= 90) ? 'A' 
			: (score >= 80) ? 'B' 
			: (score >= 70) ? 'C' 
			: (score >= 60) ? 'D' : 'F';
		System.out.printf("score(%d) : grade(%c)\n", score, grade);
		
		/*
		 * [문제] 승점계산
		 *   - 승리: 3점
		 *   - 무승: 2점
		 *   - 패배: 1점
		 */
		// char game = 'W'; // 승리('W'), 무승부('S'), 패배('L')
		// char game = 'S'; // 승리('W'), 무승부('S'), 패배('L')
		char game = 'L'; // 승리('W'), 무승부('S'), 패배('L')
		int victory = (game == 'W') ? 3 : (game == 'S') ? 2 : 1;
		System.out.printf("game(%c) : victory(%d)\n", game, victory);
	}

}
