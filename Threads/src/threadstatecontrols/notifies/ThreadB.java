package threadstatecontrols.notifies;

public class ThreadB extends Thread {
	WorkObject workobj;
	
	public ThreadB(WorkObject workobj) {
		this.workobj = workobj;
	}
	
	@Override
	public void run() {
		for(int cnt=0; cnt<10; cnt++) {
			this.workobj.methodB();
		}
	}

}
