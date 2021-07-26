package threadstate;

public class TargetThread extends Thread {
	private int loop;
	
	@Override
	public void run() {
		for(int cnt = 0; cnt < 10; cnt++) {
			loopCount();
			
			try {
				Thread.sleep(500); // 0.5초간 일시정지, TIMED_WAITING
			}
			catch(Exception e) {
			}
			// loopCount();
		}
	}
	
	public synchronized void loopCount() {
		for(long cnt=0; cnt<1000000000; cnt++) { // 10억
		}
		this.loop += 1;
		System.out.println("TargetThread: loop=" + this.loop);
	}
}
