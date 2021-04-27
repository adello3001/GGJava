/*
 * [문제8] 배열의 전체 항목의 합과 평균값을 구하라
 */
package examples;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};  

		int sum = 0;
		double avg = 0.0;
		double cnt = 0.0;
		
		for(int x=0; x < array.length; x++) {
			for(int y = 0; y < array[x].length; y++) {
				sum += array[x][y];
				cnt++;
			}
		}
		
		avg = sum / cnt;
		
		System.out.println("cnt: " + cnt);
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
	}

}
