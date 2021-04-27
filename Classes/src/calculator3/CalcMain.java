package calculator3;

class CalcMain {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		calc.plus(1,2,3,4,5,6,7,8,9,10); // 가변인자
		calc.print("calc");
		
		Calc calc2 = new Calc();
		calc2.sum(new int[] {1,2,3,4,5,6,7,8,9,10}); // 배열
		calc2.print("calc2");
	}

}
