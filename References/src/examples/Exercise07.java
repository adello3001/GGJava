/*
 * [문제7] 최대값을 구하라.
 */
package examples;

public class Exercise07 {

	public static void main(String[] args) {
		int max1 = 0;
		int[] array = { 1,5,3,8,2 };
		
		for(int cnt=0; cnt < array.length; cnt++) {
			if(max1 < array[cnt]) {
				max1 = array[cnt];
			}
		}
		
		System.out.println("max1: " + max1);
		
		int max2 = 0;
		for(int x : array) {
			if(max2 < x) {
				max2 = x;
			}
		}
		
		System.out.println("max2: " + max2);
	}
}
