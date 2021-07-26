package threadstatecontrols;

public class YieldRun {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ta.start();
		tb.start();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {}
		ta.work = false;
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {}
		ta.work = true;
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {}
		ta.stop = true;
		tb.stop = true;
		
		try {
			ta.join();
			tb.join();
		}
		catch(InterruptedException e) {
		}
	}

}
