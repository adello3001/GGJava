package swstmt;
/*
 * 조건문: switch
 * [문제] 등급에 따른 점수 환산
 * 난수를 등급단위로 발생시켜서 (A~F)
 * 각 등급에 따라 아래와 같은 점수를 배정하라.
 * A:100, B:90, C:80, D:70, E:60, F:50
 */
public class SwitchStatement3 {

	public static void main(String[] args) {
		double x = Math.random();
		int num = (int)(x * 6) + 1;
		
		System.out.printf("random:(%f)(%d)%n", x, num);
		
		char grade = 'X';
		int score = 0;
		
		switch(num) {
		case 1:
			grade = 'A';
			score = 100;
			break;
		case 2:
			grade = 'B';
			score = 90;
			break;
		case 3:
			grade = 'C';
			score = 80;
			break;
		case 4:
			grade = 'D';
			score = 70;
			break;
		case 5:
			grade = 'E';
			score = 60;
			break;
		case 6:
			grade = 'F';
			score = 50;
			break;
		default:
			grade = 'X';
			score = 0;
			break;
		}
		
		System.out.printf("grade[%c], score[%d] %n", grade, score);
	}
}
