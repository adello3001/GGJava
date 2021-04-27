package forstmt;
/*
 * 반복문(for)
 * [문제11] 구구단
 *   - 처음 만나는 계산된 결과가 30보다 크면 전체 반복문을 종료
*/
public class ForStatement11 {

	public static void main(String[] args) {
		int cnt = 0;
		boolean blockend = false;
		
		for(int x = 2; x <= 9; x++) {  // block A
			
			System.out.printf("[%d단]\n", x);
			
			for(int y=1; y <= 9; y++) { // block B
				int z = x * y;
				if(z > 30) {
					blockend = true;
					break;  // block B 탈출
				}
				System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
				++cnt;
			}
			
			if(blockend) {
				System.out.printf("[%d] 단의 끝 %n", x);
				break; // block A를 탈출
			}
			
			System.out.println("-----------------------------------");
		}
		
		System.out.println("[THE END] total count=" + cnt);
	}
}
