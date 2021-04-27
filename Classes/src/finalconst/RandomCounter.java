/*
 * 상수(불변의 값)
 *   - static final type constant = value
 *   - 선언할 때 초기값을 지정하거나
 *   - 정적블록에서 초기값을 지정해야 한다.
 */
package finalconst;

public class RandomCounter {
	static final int MAX_RANDOM_COUNT = 100;
	
	int[] values = new int[MAX_RANDOM_COUNT];
	
	RandomCounter() {
		int cnt=0;
		
		while(true) {
			if(cnt >= MAX_RANDOM_COUNT) {
				break;
			}
			
			values[cnt++] = (int)(Math.random() * 101 + 1);
		}
	}
	
	void print() {
		for(int cnt=0; cnt < MAX_RANDOM_COUNT; cnt++) {
			System.out.printf("value[%d][%d]\n", cnt, values[cnt]);
		}
	}

	public static void main(String[] args) {
		System.out.printf("[난수발생기]\n");
		System.out.printf("난수의 갯수: %d개 \n", MAX_RANDOM_COUNT);
		
		RandomCounter earth = new RandomCounter();
		earth.print();
	}
}
