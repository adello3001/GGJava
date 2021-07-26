/*
 * 제너릭은 클래스를 타입을 명시적으로 지정하여 타입을 결정한다.

 * 제너릭은 클래를 정의할 때 Classname<T>로 표기한다.
 *   - T는 참조타입
 *   - <T> 임의의 타입이 올 수 있다는 의미
 *   - T = (String | Class | Object | ...)
 *   
 * 제너릭 정의
 *   class Classname<Type> {
 *   }  
 *   
 * 제너릭 선언  
 *   Classname<Type> = new Classname<Type>
 */

package section02.generic;

public class Box<T> {
	private T name;
	
	public void set(T name) {
		this.name = name;
	}
	
	public T get() {
		return this.name;
	}
}
