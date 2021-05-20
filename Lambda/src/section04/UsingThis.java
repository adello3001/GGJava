/*
 * [클래스 멤버 사용]
 * - 람다식에서 this는 내부적으로 생성되는 익명 객체의 참조가 아니라
 *   람다식을 실행한 객체의 참조이다.
 * - 권고: 외부 클래스에 선언된 필드와 동일한 필드를 람다식에서 선언하지 않는것이 좋다.
 */
package section04;

public class UsingThis {
	public int outterField = 10;
	
	void add(int a) {
		this.outterField += a;
		System.out.printf("UsingThis,add(%d), outterField(%d)\n", a, this.outterField);
	}
	
	class Inner {
		int innerField = 20;
		
		void method() {
			MyFunctionalInterface func = () -> {
				int outterField = 99;
				int innerField = 77;
				System.out.println("outterField:" + outterField); // 람다식에 선언된 필드를 참조
				System.out.println("outterField: UsingThis.this.outterField=" + 
						UsingThis.this.outterField); // UsingThis.outterField를 참조
				
				// 람다식에 선언된 필드를 참조하지 못한다. (선언되지 않은 것으로 인식)
				// System.out.println("outterField: this.outterField=" + this.outterField); // 람다식에 선언된 필드를 참조하지 못한다.
				
				System.out.println("innerField:" + innerField); // 람다식에 선언된 필드를 참조
				System.out.println("innerField: this.outterField=" + this.innerField); // Inner.innerField 참조
			};
			
			func.method();
		}
	}
}
