/*
 * [set]
 * 1. 중복해서 들어 가지 않음
 * 2. 순서가 무작위
 * 3. 저장된 순서가 보장되지 않는다.
 */
package sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<String>();
		
		setString.add("자바");
		setString.add("자바스크립트");
		setString.add("파이썬");
		setString.add("자바"); // 중복해서 들어 가지 않음
		
		int size = setString.size();
		System.out.println("setString.size : " + size);
		
		for(String str : setString) {
			System.out.println(str);
		}

	}

}
