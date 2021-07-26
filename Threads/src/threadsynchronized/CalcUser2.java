package threadsynchronized;

public class CalcUser2 extends Thread {
	private Calc calc;
	
	public void setCalc(Calc calc) {
		this.setName("CalcUser2");
		this.calc = calc;
	}

	@Override
	public void run() {
		this.calc.setMemory(200);
		System.out.println("run >" + getName() + ":" + calc.getMemory());
	}
}
