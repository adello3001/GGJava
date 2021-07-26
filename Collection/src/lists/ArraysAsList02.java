/*
 * 고정된 객체를 리스트 배열로 처리
 *   - 자료를 추가 삭제할 수 없다.
 *   - 객체를 변경을 가능하다.
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

public class ArraysAsList02 {

	public static void main(String[] args) {
		// List<String> listLangs = Arrays.<String>asList("1.자바", "2.자바스크립트", "3.파이썬");
		List<String> listLangs = Arrays.asList("1.자바", "2.자바스크립트", "3.파이썬");
		for(String lang : listLangs) {
			System.out.println(lang);
		}
		
		// 객체를 추가하거나 삭제 할 수 없다.
		// java.lang.UnsupportedOperationException
		// listLangs.add("러스트");
		// listLangs.remove("3.파이썬");
		
		// 객체를 변경할 수는 있다.
		listLangs.set(0, "1.Java");
		for(String lang : listLangs) {
			System.out.println(lang);
		}
	}

}
