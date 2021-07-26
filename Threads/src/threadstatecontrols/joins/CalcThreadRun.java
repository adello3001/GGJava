/*
 * [������ ��ٸ�]
 *  - �����尡 ������ ������ ��ٸ�
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
