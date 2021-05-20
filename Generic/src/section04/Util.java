/*
 * 제너릭 메소드(Generic Method)
 * - 메소드에 독립적으로 제너릭을 적용 할 때
 * - public <T, R> R method(T t) {}
 */
package section04;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static <T> void printUtil(T t) {
		System.out.println("Util:" + t);
	}
	
	public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	
	/*
	 * 선언된 타입별로 메소드를 내부적(컴파일러)으로 만든다.
	 */
	/*
	public static void printUtil(String t) {
		System.out.println("Util:" + t);
	}

	
	public static void printUtil(Integer t) {
		System.out.println("Util:" + t);
	}

	public static void printUtil(Float t) {
		System.out.println("Util:" + t);
	}

	public static void printUtil(Character t) {
		System.out.println("Util:" + t);
	}
	*/
}
