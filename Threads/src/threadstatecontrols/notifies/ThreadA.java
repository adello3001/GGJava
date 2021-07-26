package threadstatecontrols.notifies;

public class ThreadA extends Thread {
	WorkObject workobj;
	
	public ThreadA(WorkObject workobj) {
		this.workobj = workobj;
	}
	
	@Override
	public void run() {
		for(int cnt=0; cnt<10; cnt++) {
			this.workobj.methodA();
		}
	}

}
