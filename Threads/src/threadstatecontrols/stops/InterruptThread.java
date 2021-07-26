/*
 * Thread.interrupted()는 Thread.interrupt()가 호출되면 true가 된다.
 * InterruptedException을 catch하지 않아야 한다.
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
