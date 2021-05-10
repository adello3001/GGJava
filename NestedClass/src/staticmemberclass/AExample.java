/*
 * [정적 내부 클래스 사용 예제]
 */
package staticmemberclass;

public class AExample {

	public static void main(String[] args) {
		/*
		 * 외부 클래스인 A를 생성하지 않아도
		 * A의 내부 클래스인 C의 객체를 생성할 수 있다.
		 */ 
		// A a = new A();
		
		System.out.println("A.C.staticfieldC(정적 필드) : " + A.C.staticfieldC);
		A.C.staticMethodC();
		
		A.C c = new A.C();
		c.methodC();
		
		// 인스턴스 메소드는 객체를 통해서만 접근(호출) 할 수 있다.
		// A.C.methodC();
		
		System.out.println("A.C.staticfieldC(정적 필드) : " + A.C.staticfieldC);
		A.C.staticMethodC();
		
		A.C.D d = new A.C.D();
		
		A.C.E e = c.new E();
		
	}
}
