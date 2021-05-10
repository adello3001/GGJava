/*
 * [로컬 멤버 클래스 예제]
 * 인스턴스 메소드 안에 정의된 클래스
 * - 클래스의 접근제한자(public, private)을 붙일 수 없다. 
 * - 정적 필드와 메소드를 정의할 수 없다.(static을 붙일 수 없음)
 */
package localmemberclass;

public class A { // 외부 클래스
	private int x = 10;
	
	A() {
		System.out.println("A(외부) 클래스 생성");
	}
	
	void methodA() {
		// public class D {
		// private class D {
		class D {
			// static int staticfield = 99;
			
			private int x = 10;
			public D() {
				System.out.println("D(로컬 클래스 생성자");
			}
			
			void methodD() {
				System.out.println("D(로컬 클래스) methodD() 메소드");
			}
			
			private void printX() {
				System.out.println("D(로컬 클래스) printX() : " + this.x);
			}
			
			// 로컬 클래스에서 정적 클래스를 만들 수 없다.
			// static class E {}
			
			// 로컬 클래스에서 정적 메소드를 만들 수 없다.
			// static void staticMethod() {}
		}
		
		D d = new D();
		d.methodD();
		d.printX();
		
		// private member field(접근 제한)
		// System.out.println("D(로컬 클래스) x= : " + this.x);
	}
}
