package whilestmt;
/*
 * 반복문(while)
 *   - 조건식이 참이면 블럭을 계속 수행
 *   - 조건식 : 비교연산식, 논리연산식
 */
public class WhileStatement5 {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			// if(keyCode != 13 && keyCode != 10) { // CR, LF
			if(keyCode != 13) { // CR
				System.out.println();
				System.out.println("+--------+--------+--------+");
				System.out.println("| 1.증속 | 2.감속 | 3.중지 |");
				System.out.println("+--------+--------+--------+");
				System.out.print("> 선택 : ");
			}
			
			keyCode = System.in.read();
			// System.out.println("> keyCode : " + keyCode);
			
			if(keyCode == 49) { // '1'
				speed++;
				System.out.printf("-> 현재속도(%d)\n", speed);
			}
			else if(keyCode == 50) { // '2'
				speed--;
				System.out.printf("-> 현재속도(%d)\n", speed);
			}
			else if(keyCode == 51) { // '3'
				run = false;
			}
		} // while
		
		System.out.printf("종료: 현재속도(%d)\n", speed);
	}
}
