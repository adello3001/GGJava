/*
 * 시스템 종료
 * - System.exit(exitcode)
 * - exitcode : 정상(0), 비정상(0이 아닌값)
 */
package section05.systems;

public class ExitExample {

	public static void main(String[] args) {
		int x = 0;
		
		while(true) {
			x += 1;
			if(x > 100) {
				// System.exit(0); // 프로그램 종료
				System.exit(-99); // 프로그램 종료
			}

			if(x > 900) {
				break;
			}
			
			System.out.println(x);
		}
		
		System.out.println("THE END");
	}
}
