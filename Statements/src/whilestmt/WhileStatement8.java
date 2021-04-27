package whilestmt;
/*
 * 반복문(while, for)
 * [문제11] 구구단
 *   - 2단부터 5단까지는 30미만을 출력
 *   - 6단부터 9단까지는 30이상을 출력
*/
public class WhileStatement8 {
	public static void main(String[] args) {
		int cnt = 0;
		int x = 2;
		
		while(x <= 9) {
			System.out.printf("[%d단]\n", x);
			for(int y=1; y <= 9; y++) {
				int z = x * y;
				
				if((x >= 2 && x <=5) && z < 30) { 
					System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
				}
				else if((x >= 6 && x <= 9) && z >= 30) {
					System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
				}

				++cnt;
			} // for(y)
			
			x++;
			System.out.println("-----------------------------------");
		} // while(x)
		
		System.out.println("[while end] total count=" + cnt);
	}
}
