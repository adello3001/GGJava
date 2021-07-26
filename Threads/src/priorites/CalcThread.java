package priorites;

public class CalcThread extends Thread {
	double tot;
	
	public CalcThread(String tname) {
		setName(tname);
	}
	
	@Override
	public void run() {
		for(int cnt = 1; cnt <= 2000000000; cnt++) {
			tot += (double)cnt;
		}
		
		System.out.printf("Thread: [%s] tot[%.0f]%n", getName(), tot);
	}

}
