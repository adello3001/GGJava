/*
 * [스레드 우선순위]
 * 디폴트   : NORM_PRIORITY(5)
 * 가장높음 : MAX_PRIORITY(10)
 * 가장낮음 : MIN_PRIORITY(1)
 */
package priorites;

public class CalcThreadRun {

	public static void main(String[] args) {
		for(int cnt=1; cnt<=10; cnt++) {
			Thread thread = new CalcThread("thread" + cnt);
			
			System.out.printf("[%s] default priority(%d)\n", thread.getName(), thread.getPriority());
			
			if(cnt == 10) {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			else {
				thread.setPriority(Thread.MIN_PRIORITY);
			}

			System.out.printf("[%s] priority(%d)\n", thread.getName(), thread.getPriority());
			
			thread.start();
		}
	}

}
