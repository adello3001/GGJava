package threadsynchronized;

public class CalcSyncUser2 extends Thread {
	private CalcSync calc;
	
	public void setCalc(CalcSync calc) {
		this.setName("CalcSyncUser2");
		this.calc = calc;
	}

	@Override
	public void run() {
		this.calc.setMemory(200);
		System.out.println("run >" + getName() + ":" + calc.getMemory());
	}
}
