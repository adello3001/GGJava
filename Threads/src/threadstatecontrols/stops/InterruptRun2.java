package threadstatecontrols.stops;

public class InterruptRun2 {

	public static void main(String[] args) {
		Thread thread = new InterruptThread2();
		thread.start();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {}
		
		thread.interrupt();
	}

}
