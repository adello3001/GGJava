package threadstatecontrols;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(stop != true) {
			if(work) {
				System.out.println("ThreadA: Working...");
			}
			else {
				System.out.println("ThreadA: yield...");
				Thread.yield();
			}
		}
		
		System.out.println("ThreadA: stop!!!");
	}
}
