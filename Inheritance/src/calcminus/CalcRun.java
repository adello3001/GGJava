package calcminus;

public class CalcRun {

	public static void main(String[] args) {
		CalcMinus calc = new CalcMinus(1000);
		int sum = calc.compute(10);
		sum = calc.computeMinus(900);
		System.out.println("Calc:sum=" + sum);
		
		System.out.println("Calc:sum=" + calc.getSum());

		// CalcRun은 Calc로부터 상속되지 않았으므로 Calc.sum에 접근할 수 없다.
		// System.out.println("Calc:sum=" + calc.sum); 
	}
}
