package forstmt;
/*
 * 반복문(for)
 * [문제11] 구구단
 *   - 처음 만나는 계산된 결과가 30보다 크면 전체 반복문을 종료
*/
public class ForStatement15 {

	public static void main(String[] args) {
		for(int x = 2; x <= 9; x++) {  // block A
			for(int y=1; y <= 9; y++) { // block B
				int z = x * y;
				System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
			}
			System.out.println("-----------------------------------");
		}
	}
}
