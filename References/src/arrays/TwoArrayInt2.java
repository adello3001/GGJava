package arrays;
/*
 * 2차원 배열
 */
public class TwoArrayInt2 {

	public static void main(String[] args) {
		int[][] td = new int[2][3];
		
		for(int row=0; row < td.length; row++) { // td.length: 행의 크기(갯수)
			for(int col=0; col < td[row].length; col++) { // td[row].length 컬럼의 크기(갯수)
				td[row][col] = row * col;
				System.out.printf("td[%d][%d]=[%d]\n", row, col, td[row][col]);
				
			}
		}
	}
}
