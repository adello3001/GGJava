package promotions;

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionExample {
	
	public static void main(String[] args) {
		System.out.println("Promotion Example");
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// Type mismatch: cannot convert
		/*
		B b2 = c;
		C c2 = b;
		B b3 = e;
		C c3 = d;
		D d2 = e;
		E e2 = d;
		*/
	}
	
}
