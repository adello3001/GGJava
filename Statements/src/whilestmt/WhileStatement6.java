package whilestmt;
/*
 * 반복문(while)
 *   - 조건식이 참이면 블럭을 계속 수행
 *   - 조건식 : 비교연산식, 논리연산식
 *--------------------------------------------------------------
 * [문제]
   - 조건: 최소스피드(0), 최대스피드(100) 
   - 메뉴 : 
 	 1.증속(+1)
       - 최대 스프드가 되면 최소 스피드로 변경(0)
       
     2.감속(-1)
       - 최소 스피드가 되면 최대 스피드로 변경(100)
       
	 3.증속(+10)
	   - 최대 스피드가 100을 넘어서면 넘어선 만큼 0부터 증속
	   - 예) 99에서 증속(+10)이 되면 9로 변경
	  
	4.감속(-10)
       - 최소 스피드가 0보다 작아지면 넘어선 만큼 100부터 감속
	   - 예) 1에서 감속(-10)이 되면 91로 변경
	  
	5.중지
 */

public class WhileStatement6 {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) { // CR, LF
				System.out.println();
				System.out.println("+------------+------------+-------------+-------------+--------+");
				System.out.println("| 1.증속(+1) | 2.감속(-1) | 3.증속(+10) | 4.감속(-10) | 5.중지 |");
				System.out.println("+------------+------------+-------------+-------------+--------+");
				System.out.print("> 선택 : ");
			}

			keyCode = System.in.read();
			
			if(keyCode == 49) { // 증속(+1)
				speed = (speed >= 100) ? 0 : speed + 1;
				System.out.printf("-> 현재속도(%d)\n", speed);
			}
			else if(keyCode == 50) { // 감속(-1)
				speed = (speed <= 0) ? 100 : speed - 1;
				System.out.printf("-> 현재속도(%d)\n", speed);
			}
			else if(keyCode == 51) { // 증속(+10)
				speed += 10;
				speed = (speed > 100) ? speed - 100 : speed;
				System.out.printf("-> 현재속도(%d)\n", speed);
			}
			else if(keyCode == 52) { // 감속(-10)
				speed -= 10;
				speed = (speed < 0) ? 100 + speed : speed;
				System.out.printf("-> 현재속도(%d)\n", speed);
			}
			else if(keyCode == 53) { // '5'
				run = false;
			}
		} // while
		
		System.out.printf("종료: 현재속도(%d)\n", speed);
	}
}
