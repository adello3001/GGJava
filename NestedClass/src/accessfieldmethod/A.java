/*
 * [중첩 클래스에서 필드와 메소드의 접근 제한]
 */
package accessfieldmethod;

public class A {
	// B fieldB = new B();
	// C fieldC = new C();
	B fieldB = null;
	C fieldC = null;
	B filedX = this.new B("B filedX");
	B filedY = null;
	
	// 정적 필드는 this(객체레퍼런스)를 가지고 있지 않음
	// static B staticFieldB = new B();
	// static B staticFieldB = this.new B();
	
	// 클래스 C는 정적 멤버 클래스이므로 정적 필드 선언을 할 수 있다.
	static C staticFieldC = new C("staticFieldC");
	
	A() {
		System.out.println("A class");
		this.fieldB = new B();
		this.fieldC = new C();
		this.filedY = this.new B("B fieldY");
	}
	
	class B {
		String name;
		B() {
			System.out.println("B class");
		}
		
		B(String name) {
			this.name = name;
			System.out.println(name);
		}
	}
	
	static class C {
		String name;
		C() {
			System.out.println("C class");
		}
		
		C(String name) {
			this.name = name;
			System.out.println(name);
		}
		
		void methodC() {
			System.out.println(name + ":" + "methodC()");
		}
	}
	
	
	// 다른 패키지와 클래스 이름이 충돌될 때 사용
	// A.B fieldB = new A.B();
	// A.C fieldC = new A.C();
	
	void instanceMethod() {
		B localB = new B("localB");
		C localC = new C("localC");
	}
	
	// 정적 멤버 메소드
	// 정적 메버 메소드는 객체의 this를 가지고 있지 않다.
	// 인스턴스 멤버 클래스를 생성할 수 없다.
	static void staticMethod() {
		// B staticLocalB = new B("staticLocalB");
		// B staticLocalB = this.new B("staticLocalB");
		C staticLocalC = new C("staticLocalC");
	}
}
