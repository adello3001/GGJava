package whilestmt;
/*
 * 반복문(while, for)
 * [문제11] 구구단
 *   조건: break, continue를 이용하라
 *   - 2단부터 5단까지는 30미만을 출력
 *   - 6단부터 9단까지는 30이상을 출력
*/
public class WhileStatement9 {
	public static void main(String[] args) {
		int x = 1;
		
		while(++x <= 9) {
			System.out.printf("[%d단]\n", x);
			
			for(int y=1; y <= 9; y++) {
				int z = x * y;
				
				if(x >= 2 && x <=5) {
					if(z >= 30) { 
						break;
					}
					System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
				}
				else if(x >= 6 && x <= 9) {
					if(z < 30) {
						continue;
					}
					System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
					/*
					if(z >= 30) {
						System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
					}
					*/
				}
			} // for(y)
			
			System.out.println("-----------------------------------");
		} // while(x)
		
		System.out.println("[THE END]");
	}
}
