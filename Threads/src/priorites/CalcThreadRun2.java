/*
 * [스레드 우선순위]
 * 디폴트   : NORM_PRIORITY(5)
 * 가장높음 : MAX_PRIORITY(10)
 * 가장낮음 : MIN_PRIORITY(1)
 */
package priorites;

public class CalcThreadRun2 {

	public static void main(String[] args) {
		for(int cnt=1; cnt<=20; cnt++) {
			Thread thread = new CalcThread("thread" + cnt);
			
			if(cnt % 2 == 1) {
				thread.setPriority(7);
			}
			else {
				thread.setPriority(9); // 우선수위가 높음
			}

			System.out.printf("[%s] priority(%d)\n", thread.getName(), thread.getPriority());
			
			thread.start();
		}
	}

}
