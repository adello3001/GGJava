package basics;
/*
 * 2차원 배열
 */
public class TwoArrayInt1 {

	public static void main(String[] args) {
		// int[][] td = { {11,12,13}, {21,22,23} };
		// int[][] td = { {11,12}, {21,22,23} };
		int[][] td = { {11}, {21,22}, {31,32,33} };
		
		System.out.printf("td[%d]\n", td[0][0]);
		
		System.out.println();
		
		System.out.printf("td[%d]\n", td[1][0]);
		System.out.printf("td[%d]\n", td[1][1]);

		System.out.println();

		System.out.printf("td[%d]\n", td[2][0]);
		System.out.printf("td[%d]\n", td[2][1]);
		System.out.printf("td[%d]\n", td[2][2]);
	}

}
