package arrays;
/*
 * 2차원 배열
 */
public class TwoArrayInt4 {

	public static void main(String[] args) {
		int[][] td = new int[3][];
		
		for(int row=0; row < td.length; row++) {
			td[row] = new int[row + 1];
			
			for(int col=0; col < td[row].length; col++) {
				td[row][col] = row * col;
				System.out.printf("td[%d][%d]=[%d]\n", row, col, td[row][col]);
			}
			System.out.println();
		}
	}
}
