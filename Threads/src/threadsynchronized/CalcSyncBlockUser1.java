package threadsynchronized;

public class CalcSyncBlockUser1 extends Thread {
	private CalcSync calc;
	
	public void setCalc(CalcSync calc) {
		this.setName("CalcSyncUser1");
		this.calc = calc;
	}

	@Override
	public void run() {
		this.calc.setMemoryBlock(100);
		System.out.println("run >" + getName() + ":" + calc.getMemory());
	}
}
