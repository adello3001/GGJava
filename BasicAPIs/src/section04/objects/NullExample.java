/*
 * Objects.requireNonNull(T obj)
 * - null이 아니면 파라미터로 전달된 값이 리턴
 * - null이면 NullPointerException 예외가 발생하므로 null이면 반드시 예외처리를 해야 한다.
 * - null이면 기본값(default)으로 지정된 값을 리턴
 */
package section04.objects;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = null;
		
		System.out.println("isNull(s1): " + Objects.isNull(s1)); // false
		System.out.println("isNull(s2): " + Objects.isNull(s2)); // true

		System.out.println("nonNull(s1): " + Objects.nonNull(s1)); // true
		System.out.println("nonNull(s2): " + Objects.nonNull(s2)); // false
		
		System.out.println("s1: " + Objects.requireNonNull(s1));
		
		// System.out.println("s2: " + Objects.requireNonNull(s2, "널"));
		
		try {
			System.out.println("s2: " + Objects.requireNonNull(s2));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("s2: " + Objects.requireNonNull(s2, "기본값"));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
