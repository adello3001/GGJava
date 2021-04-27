package basics;
/*
 * [문제] 9*9의 2차원 배열을 만들고 1부터 순차적으로 1씩 증가한 값을 넣어라.
 */
public class example1 {

	public static void main(String[] args) {
		int[][] td = new int[9][9];

		int cnt = 0;
		for(int x = 0; x < 9; x++) {
			for(int y = 0; y < 9; y++) {
				td[x][y] = ++cnt;
				System.out.printf("[%2d] ", td[x][y]);
			}
			System.out.println();
		}
	}
}
