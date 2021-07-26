package threadsynchronized;

public class CalcUser1 extends Thread {
	private Calc calc;
	
	public void setCalc(Calc calc) {
		this.setName("CalcUser1");
		this.calc = calc;
	}

	@Override
	public void run() {
		this.calc.setMemory(100);
		System.out.println("run >" + getName() + ":" + calc.getMemory());
	}
}
