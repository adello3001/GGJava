package threadstatecontrols.notifies;

public class WaitNotifyRun {

	public static void main(String[] args) {
		WorkObject sharedWork = new WorkObject();
		
		ThreadA ta = new ThreadA(sharedWork);
		ThreadB tb = new ThreadB(sharedWork);
		ta.start();
		tb.start();
	}
}
