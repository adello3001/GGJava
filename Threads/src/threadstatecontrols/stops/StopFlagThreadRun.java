package threadstatecontrols.stops;

public class StopFlagThreadRun {

	public static void main(String[] args) {
		StopFlagThread stopThread = new StopFlagThread();
		stopThread.start();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {}

		stopThread.setStop(true);
	}

}
