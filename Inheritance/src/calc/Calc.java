package calc;

public class Calc {
	protected int sum; // 자식 클래스에서 접근 허용 
	int prevsum; // default 접근자
	private int privsum = -1;
	
	public Calc() {
		this.sum = 0;
	}
	
	public Calc(int sum) {
		this.prevsum = this.sum;
		this.sum = sum;
	}
	
	public int compute(int x) {
		this.prevsum = this.sum;
		this.sum += x;
		return this.sum;
	}
	
	public int getSum() {
		return this.sum;
	}
	
	protected int getPrivSum() {
		return this.privsum;
	}
}
