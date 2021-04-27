package basics;
/*
 * 2차원 배열
 */
public class TwoArrayInt2a {

	public static void main(String[] args) {
		// int[][] td = new int[][]{ {11,12,13}, {21,22,23}, {31,32,33} };
		int[][] td = new int[][]{ {11,12,13}, {21,22,23}, {31,32,33} };
		
		for(int row=0; row < td.length; row++) { // td.length: 행의 크기(갯수)
			for(int col=0; col < td[row].length; col++) { // td[row].length 컬럼의 크기(갯수)
				System.out.printf("td[%d][%d]=[%d]\n", row, col, td[row][col]);
				
			}
		}
	}
}
