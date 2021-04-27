package calculator;

class CalcMain {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		calc.plus(100);
		calc.minus(50);
		calc.multiple(4);
		calc.divide(2);
		calc.print();

		System.out.println("clac: total :" + calc.total);
		System.out.println("clac: total() :" + calc.total());
		
		Calc calc2 = new Calc(calc.total());
		calc2.plus(70);
		calc2.print();
	}

}
