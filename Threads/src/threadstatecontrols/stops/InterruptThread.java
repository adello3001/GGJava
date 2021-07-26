/*
 * Thread.interrupted()�� Thread.interrupt()�� ȣ��Ǹ� true�� �ȴ�.
 * InterruptedException�� catch���� �ʾƾ� �Ѵ�.
 *  
 */
package threadstatecontrols.stops;

public class InterruptThread extends Thread {
	boolean stop=false;
	
	@Override
	public void run() {
		while(stop != true) {
			System.out.println("InterruptThread: working : interrupted=" + Thread.interrupted());
			if(Thread.interrupted() ) {
				System.out.println("InterruptThread: interrupted...");
				break;
			}
			
			/*
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("InterruptThread: interrupted exception..");
				// stop = true;
			}
			*/
		}
		
		System.out.println("InterruptThread: interrupted & stoped...");
	}

}
