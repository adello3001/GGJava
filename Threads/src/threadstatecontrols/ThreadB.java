package threadstatecontrols;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(stop != true) {
			if(work) {
				System.out.println("ThreadB: Working...");
			}
			else {
				System.out.println("ThreadB: yield...");
				Thread.yield();
			}
		}
		
		System.out.println("ThreadB: stop!!!");
	}
}
