package threadname;

public class ThreadSum extends Thread {
	private int count;
	private int sum;
	
	public ThreadSum(String tname, int count) {
		super.setName(tname);
		this.count = count;
	}
	
	@Override
	public void run() {
		System.out.printf("* Thread: start[%s][%d]%n", getName(), this.count);

		for(int cnt=0; cnt <= this.count; cnt++) {
			sum += cnt;
		}
		
		System.out.printf("* Thread: end[%s], sum[%d]%n", getName(), this.sum);
	}
	
	public int sum() {
		return this.sum;
	}
}
