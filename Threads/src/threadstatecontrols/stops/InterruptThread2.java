/*
 * InterruptedException을 catch하게 되면  
 * Thread.interrupted()로 값을 체크할 수 없다.
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
