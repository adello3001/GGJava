/*
 * 키보드로부터 학생수와 각 학생들의 점수를 입력받아서
 * 최고점수, 평균점수 구하라.
 */
package examples;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("+----------+------------+--------------+--------+--------+");
			System.out.println("| 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 |");
			System.out.println("+----------+------------+--------------+--------+--------+");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				if(studentNum <= 0) {
					studentNum = 0;
					break;
				}
				/*
				if(studentNum > 0 && scores == null || (scores != null && studentNum > scores.length)) {
					scores = new int[studentNum];
				}
				*/
				scores = new int[studentNum];
				break;
				
			case 2:
				for(int cnt = 0; cnt < studentNum; cnt++) {
					System.out.printf("scores[%d] >", cnt);
					scores[cnt] = scanner.nextInt();
				}
				break;
				
			case 3:
				for(int cnt = 0; cnt < studentNum; cnt++) {
					System.out.printf("scores[%d] = [%d]\n", cnt, scores[cnt]);
				}
				break;
				
			case 4: {
					int max = 0;
					int sum = 0;
					for(int cnt = 0; cnt < studentNum; cnt++) {
						max = (max < scores[cnt]) ? scores[cnt] : max;
						sum += scores[cnt];
					}
					
					double avg = sum / studentNum;
					
					System.out.printf("studentNum(%d), max(%d), avg(%f)\n", studentNum, max, avg); 
				}
				break;
				
			case 5:
				run = false;
				break;
			}
		}

	}

}
