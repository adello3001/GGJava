package calculator;

class CalcMain2 {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		calc.plus(100);
		calc.minus(50);
		calc.multiple(4);
		calc.divide(2);
		calc.print();

		Calc calc2 = new Calc(calc);
		calc2.plus(70);
		calc2.print();
	}

}
