/*
 * [스레드 기다림]
 *  - 스레드가 종료할 때까지 기다림
 *  - Thread.join()
 */
package threadstatecontrols.joins;

public class CalcThreadRun {

	public static void main(String[] args) {
		CalcThread thread = new CalcThread("tot");
		thread.start();
		
		try {
			thread.join();
		}
		catch(InterruptedException e) {
			
		}
		
		System.out.printf("Thread: [%s] tot[%.0f]%n", thread.getName(), thread.total());
		
	}

}
