/*
 * 제너릭은 클래를 정의할 때 Classname<T>로 표기한다.
 *   - <T> 임의의 타입이 올 수 있다는 의미
 *   
 * 제너릭은 클래스를 선언할 때 타입을 명시적으로 지정하여 타입을 결정한다.
 *   - Classname<Type> = new Classname<Type>
 */
package section04;

public class Box<T> {  // T = (int | float | double | String | Class | Object | ...)
	private T name;    // private String name;
	
	public void set(T name) {
		this.name = name;
	}
	
	public T get() {
		return this.name;
	}
}
