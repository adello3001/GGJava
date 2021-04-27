package forstmt;
/*
 * 반복문(for)
 * [문제11] 구구단
 *   - 처음 만나는 계산된 결과가 30보다 크면 전체 반복문을 종료
*/
public class ForStatement13 {

	public static void main(String[] args) {
		int cnt = 0;
		
		Blockend1:for(int x = 2; x <= 9; x++) {
			System.out.printf("[%d단]\n", x);
			for(int y=1; y <= 9; y++) {
				int z = x * y;
				if(z > 30) {
					break Blockend1;
				}
				System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
				++cnt;
			}
			
			
			System.out.println("-----------------------------------");
		}
		
		System.out.println("[THE END] total count=" + cnt);
	}
}
