package scores;


/*
[문제] 5시까지 
1. 새로운 프로젝트 ExamScore를 만든다.
2. 국어, 영어, 수학 점수를 입력 받는다.
3. 총점을 구한다.
4. 평균을 구한다.
5. 각 점수와 총점과 평균를 출력한다.
6. 평균 점수에 따른 등급 출력
   - A : >= 90
   - B : >= 80
   - C : >= 70
   - D : >= 60
   - F : < 60
7. 각 등급에 따라서 메시지 출력
   - A, B 등급: 훌륭합니다.
   - C, D 등급: 참 잘 했습니다.
   - F : 좀더 노력하세요.
*/
public class ExamScore2 {
	public static void main(String args[]) {
		int kor = 65;
		int eng = 76;
		int math = 85;
		int total = kor + eng + math;
		float avg = total / 3.0f;
		
		System.out.printf("국어(%d), 영어(%d), 수학(%d) %n", kor, eng, math);
		System.out.printf("합계(%d), 평균(%f) %n", total, avg);
		
		char grade = (avg >= 90) ? 'A' : 
			(avg >= 80) ? 'B' :
			(avg >= 70) ? 'C' :
			(avg >= 60) ? 'D' : 'F';
		
		System.out.printf("등급(%c) %n", grade);
		
		String strMsg = (grade == 'A' || grade == 'B') ? "훌륭합니다." :
			(grade == 'C' || grade == 'D') ? "참 잘했습니다." : "좀 더 노력하세요.";
				
		System.out.println(strMsg);
	}
}
