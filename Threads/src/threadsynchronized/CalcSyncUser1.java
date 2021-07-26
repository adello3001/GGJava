package threadsynchronized;

public class CalcSyncUser1 extends Thread {
	private CalcSync calc;
	
	public void setCalc(CalcSync calc) {
		this.setName("CalcSyncUser1");
		this.calc = calc;
	}

	@Override
	public void run() {
		this.calc.setMemory(100);
		System.out.println("run >" + getName() + ":" + calc.getMemory());
	}
}
