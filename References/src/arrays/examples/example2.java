package arrays.examples;
/*
 * [문제] 9*9의 2차원 배열을 만들고 1부터 순차적으로 1씩 증가한 값을 넣어라.
 * 각 행과 열의 합을 구하라
 */
public class example2 {

	public static void main(String[] args) {
		int[][] td = new int[10][10];

		int tot = 0;
		int cnt = 0;
		for(int x = 0; x < 9; x++) {
			for(int y = 0; y < 9; y++) {
				td[x][y] = ++cnt;
				td[x][9] += td[x][y];
				td[9][y] += td[x][y]; 
				System.out.printf("[%3d] ", td[x][y]);
			}
			tot += td[x][9];
			System.out.printf("= [%3d]\n", td[x][9]);
		}
		
		int sum = 0;
		for(int x=0; x < 9; x++ ) {
			sum += td[9][x];
			System.out.printf("[%3d] ", td[9][x]);
		}
		System.out.printf("= [%3d][%3d]\n", sum,tot);
	}
}
