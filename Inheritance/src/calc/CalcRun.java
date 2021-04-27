package calc;

public class CalcRun {

	public static void main(String[] args) {
		Calc calc = new Calc(900);
		int sum = calc.compute(10);
		System.out.println("Calc:sum=" + sum);
		// System.out.println("Calc:sum=" + calc.sum);
		System.out.println("Calc:sum=" + calc.getSum());
	}

}
