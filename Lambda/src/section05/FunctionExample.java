/*
 * Function 함수적 인터페이스
 * @FunctionalInterface
 * public interface Function<T, R> {
 *    R apply(T t);
 * }
 */
package section05;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer, String> function = t -> {
			String format = String.format("Function:%d", t);
			return format;
		};
		
		String str = function.apply(1234);
		System.out.println(str);
	}
}
