package basics;
/*
 * [문제] 9*9의 2차원 배열을 만들고 1부터 순차적으로 1씩 증가한 값을 넣어라.
 * 각 행과 열의 합을 구하라
 */
public class example3 {

	public static void main(String[] args) {
		int[][] td = new int[10][10];

		int tot1 = 0;
		int tot2 = 0;
		int cnt = 0;
		for(int x = 0; x < 9; x++) {
			for(int y = 0; y < 9; y++) {
				++cnt;
				if(x == y) {
					td[x][y] = cnt;
					tot1 += cnt;
				}
				else {
					td[x][y] = 0;
				}
				
				if((8-x) == y) {
					tot2 += cnt;
				}
				
				System.out.printf("[%3d] ", td[x][y]);
			}
			System.out.printf("= [%3d] [%3d]\n", tot1, tot2);
		}
	}
}
