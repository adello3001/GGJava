/*
 * Generic
 * 제한된 타입 파라미터
 * 상위 클래스를 제한(Upper Bounded Wildcards)
 * - 상위 타입이나 하위 타입만 지정할 수 있다.
 */
package section05;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		System.out.println("Number.compare...");
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1,  v2);
	}
	
	public static <T extends String> boolean compare(T t1, T t2) {
		System.out.println("String.compare...");
		String v1 = String.valueOf(t1);
		String v2 = String.valueOf(t2);
		return v1.equals(v2);
	}
	
}
