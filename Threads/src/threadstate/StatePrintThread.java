package threadstate;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread() {
		this.targetThread = new TargetThread();
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("TargetThread State: " + state);
			
			if (state == Thread.State.NEW) {
				targetThread.start();
			}

			if(state == Thread.State.TERMINATED) {
				break;
			}
			
			try {
				((TargetThread)targetThread).loopCount();
				// Thread.sleep(500); // 0.5 second
			}
			catch(Exception e) {
			}
		}
	}
}
