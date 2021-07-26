package promotions;

class A1 {}

class B1 extends A1 {}
class C1 extends A1 {}

class D1 extends B1 {}
class E1 extends C1 {}


public class PromotionExample2 {
	public static void main(String[] args) {
		System.out.println("Promotion Example");

		B1 b1 = new B1();
		C1 c1 = new C1();
		D1 d1 = new D1();
		E1 e1 = new E1();
		
		// Type mismatch: cannot convert
		/*
		B1 b2 = c1;
		C1 c2 = b1;
		B1 b3 = e1;
		C1 c3 = d1;
		D1 d2 = e1;
		E1 e2 = d1;
		*/
	}

}
