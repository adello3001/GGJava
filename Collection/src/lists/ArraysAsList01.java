/*
 * 고정된 객체를 리스트 배열로 처리
 * 리스트에 자료를 추가할 수 없다.
 * 
 * public class Arrays {
    @SafeVarargs
    @SuppressWarnings("varargs")
    public static <T> List<T> asList(T... a) {
        return new ArrayList<>(a);
    }
 */
package lists;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList01 {

	public static void main(String[] args) {
		// List<String> listLangs = Arrays.<String>asList("1.자바", "2.자바스크립트", "3.파이썬");
		List<String> listLangs = Arrays.asList("1.자바", "2.자바스크립트", "3.파이썬");
		for(String lang : listLangs) {
			System.out.println(lang);
		}

	}

}
