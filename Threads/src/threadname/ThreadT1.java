package threadname;

public class ThreadT1 extends Thread {
	public ThreadT1() {
		super.setName("ThreadT1");
	}
	
	@Override
	public void run() {
		for(int cnt=0; cnt < 5; cnt++) {
			String tname = super.getName();
			System.out.printf("Thread:[%s][%d]%n", tname, cnt);
		}
	}
}
