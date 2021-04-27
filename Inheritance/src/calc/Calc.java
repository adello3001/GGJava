package calc;

public class Calc {
	protected int sum; // 자식 클래스에서 접근 허용 
	
	public Calc() {
		this.sum = 0;
	}
	
	public Calc(int sum) {
		this.sum = sum;
	}
	
	public int compute(int x) {
		this.sum += x;
		return this.sum;
	}
	
	public int getSum() {
		return this.sum;
	}
}
