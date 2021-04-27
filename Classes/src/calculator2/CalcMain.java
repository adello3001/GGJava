package calculator2;

class CalcMain {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		calc.plus(100);
		calc.plus(15.1);
		calc.minus(25.1);
		calc.print();

		Calc calc2 = new Calc(3.14);
		calc2.plus(1.1234);
		calc2.print();
	}

}
