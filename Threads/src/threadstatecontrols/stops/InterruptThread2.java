/*
 * InterruptedException�� catch�ϰ� �Ǹ�  
 * Thread.interrupted()�� ���� üũ�� �� ����.
 */

package threadstatecontrols.stops;

public class InterruptThread2 extends Thread {
	boolean stop=false;
	
	@Override
	public void run() {
		while(stop != true) {
			System.out.println("InterruptThread: working...");
			
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("InterruptThread: interrupted exception..");
				stop = true;
			}
		}
		
		System.out.println("InterruptThread: interrupted & stoped...");
	}

}
