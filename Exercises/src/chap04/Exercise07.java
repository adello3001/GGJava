package chap04;
import java.util.Scanner;
/*
 * 예금, 출금, 조회, 종료
 */
public class Exercise07 {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int balance = 0;
		int keyCode = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) { // CR, LF
				System.out.println();
				System.out.println("+--------+--------+--------+--------+");
				System.out.println("| 1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
				System.out.println("+--------+--------+--------+--------+");
				System.out.print("> 선택 : ");
			}

			keyCode = System.in.read();
			
			if(keyCode == 49) { // 2. 예금
				System.out.print("예금액> ");
				int money = scanner.nextInt();
				balance += money;
			}
			else if(keyCode == 50) { // 2. 출금
				System.out.print("출금액> ");
				int money = scanner.nextInt();
				balance -= money;
			}
			else if(keyCode == 51) { // 3. 잔고
				System.out.printf("잔고> (%d)\n", balance);
			}
			else if(keyCode == 52) { // 4. 종료
				run = false;
			}
		} // while
		
		System.out.printf("종료: 현재잔고(%d)\n", balance);
	}
}
