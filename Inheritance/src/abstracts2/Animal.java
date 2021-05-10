/*
 * 추상 클래스는 new를 사용하여 객체를 생성할 수 없다.
 * 반드시 추상 클래스를 상속한 클래스를 통해 객체를 생성해야 한다.
 */
package abstracts2;

/*
public class Animal {
	public void move() {
		System.out.println("동물은 움직인다.");
	}
}
*/

public abstract class Animal {
	public String kind = "동물";
	/*
	 * [추상 메소드]
	 * 추상 메소드는 구현을 가지고 있지 않다.
	 * 상속한 클래스에서 구현을 해야 한다.
	 */
	public abstract void move();
	public abstract void sound();
	
	public void breathe() {
		System.out.println("동물은 호흡을 한다.");
	}
}


